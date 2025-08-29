package com.example.xmltojson.service;

import com.example.xmltojson.model.mt103.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

@Service
public class Pain001ToMt103TranslatorService {
    private final JAXBContext jaxbContext;
    private final ObjectMapper objectMapper;

    public Pain001ToMt103TranslatorService() throws JAXBException {
        this.jaxbContext = JAXBContext.newInstance(com.example.xmltojson.model.pain001.Document.class);
        this.objectMapper = new ObjectMapper();
        this.objectMapper.registerModule(new JavaTimeModule());
        this.objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    }

    public String translatePain001XmlToMt103Json(String pain001Xml) throws JAXBException {
        if (pain001Xml == null) {
            throw new NullPointerException("Input XML cannot be null");
        }
        if (pain001Xml.trim().isEmpty()) {
            throw new JAXBException("Input XML cannot be empty");
        }

        System.out.println("Original XML content:");
        System.out.println(pain001Xml);

        // Unmarshal PAIN.001 XML to POJO
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(pain001Xml);
        Object unmarshalled = unmarshaller.unmarshal(reader);
        com.example.xmltojson.model.pain001.Document pain001Doc = 
            (com.example.xmltojson.model.pain001.Document) unmarshalled;
            
        System.out.println("Unmarshalled document class: " + pain001Doc.getClass().getName());
        if (pain001Doc.getCstmrCdtTrfInitn() != null && 
            pain001Doc.getCstmrCdtTrfInitn().getGrpHdr() != null) {
            System.out.println("Message ID from unmarshalled object: " + 
                pain001Doc.getCstmrCdtTrfInitn().getGrpHdr().getMsgId());
        }
        
        // Create MT103 document structure
        MT103Document mt103Doc = new MT103Document();
        FIToFICustomerCreditTransfer fiToFICustomerCreditTransfer = new FIToFICustomerCreditTransfer();
        
        // Map Group Header
        com.example.xmltojson.model.pain001.CustomerCreditTransferInitiation cstmrCdtTrfInitn = 
            pain001Doc.getCstmrCdtTrfInitn();
            
        if (cstmrCdtTrfInitn != null) {
            // Get or create group header
            com.example.xmltojson.model.pain001.GroupHeader groupHeader = cstmrCdtTrfInitn.getGrpHdr();
            if (groupHeader == null) {
                groupHeader = new com.example.xmltojson.model.pain001.GroupHeader();
            }
            
            // Ensure required fields are set
            if (groupHeader.getMsgId() == null || groupHeader.getMsgId().trim().isEmpty()) {
                groupHeader.setMsgId("DEFAULT-MSG-ID");
            }
            if (groupHeader.getCreDtTm() == null || groupHeader.getCreDtTm().trim().isEmpty()) {
                groupHeader.setCreDtTm(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));
            }
            if (groupHeader.getNbOfTxs() == null || groupHeader.getNbOfTxs().trim().isEmpty()) {
                groupHeader.setNbOfTxs("1");
            }
            if (groupHeader.getCtrlSum() == null || groupHeader.getCtrlSum().trim().isEmpty()) {
                groupHeader.setCtrlSum("0.0");
            }
            
            fiToFICustomerCreditTransfer.setGroupHeader(mapGroupHeader(groupHeader));
            
            // Process Payment Information
            if (cstmrCdtTrfInitn.getPmtInf() != null && !cstmrCdtTrfInitn.getPmtInf().isEmpty()) {
                com.example.xmltojson.model.pain001.PaymentInformation paymentInfo = 
                    cstmrCdtTrfInitn.getPmtInf().get(0);
                    
                fiToFICustomerCreditTransfer.setCreditTransferTransactionInformation(
                    mapCreditTransferTransaction(paymentInfo)
                );
            }
        }
        
        mt103Doc.setFiToFICustomerCreditTransfer(fiToFICustomerCreditTransfer);
        
        try {
            // Convert MT103 POJO to JSON
            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
            return objectMapper.writeValueAsString(mt103Doc);
        } catch (Exception e) {
            throw new RuntimeException("Error converting MT103 to JSON", e);
        }
    }

    private com.example.xmltojson.model.mt103.GroupHeader mapGroupHeader(com.example.xmltojson.model.pain001.GroupHeader painHeader) {
        com.example.xmltojson.model.mt103.GroupHeader mt103Header = new com.example.xmltojson.model.mt103.GroupHeader();
        mt103Header.setMessageId(painHeader.getMsgId());
        mt103Header.setCreationDateTime(parseDateTime(painHeader.getCreDtTm()));
        mt103Header.setNumberOfTransactions(painHeader.getNbOfTxs());
        
        try {
            mt103Header.setControlSum(Double.parseDouble(painHeader.getCtrlSum()));
        } catch (NumberFormatException e) {
            mt103Header.setControlSum(0.0);
        }
        
        // Map initiating party
        if (painHeader.getInitgPty() != null) {
            com.example.xmltojson.model.mt103.PartyIdentification party = new com.example.xmltojson.model.mt103.PartyIdentification();
            party.setName(painHeader.getInitgPty().getNm());
            mt103Header.setInitiatingParty(party);
        }
        
        return mt103Header;
    }

    private com.example.xmltojson.model.mt103.CreditTransferTransactionInformation mapCreditTransferTransaction(
            com.example.xmltojson.model.pain001.PaymentInformation paymentInfo) {
        
        com.example.xmltojson.model.mt103.CreditTransferTransactionInformation mt103Tx = 
            new com.example.xmltojson.model.mt103.CreditTransferTransactionInformation();
        
        // Map payment identification
        com.example.xmltojson.model.mt103.PaymentIdentification pmtId = 
            new com.example.xmltojson.model.mt103.PaymentIdentification();
        pmtId.setInstructionId(paymentInfo.getPmtInfId());
        
        // Process the first transaction if available
        if (paymentInfo.getCdtTrfTxInf() != null && !paymentInfo.getCdtTrfTxInf().isEmpty()) {
            com.example.xmltojson.model.pain001.CreditTransferTransactionInformation txInfo = 
                paymentInfo.getCdtTrfTxInf().get(0);
                
            // Set end-to-end ID from transaction if available
            if (txInfo.getPmtId() != null) {
                pmtId.setEndToEndId(txInfo.getPmtId().getEndToEndId());
            }
            
            // Map creditor information
            if (txInfo.getCdtr() != null) {
                com.example.xmltojson.model.mt103.PartyIdentification creditor = 
                    new com.example.xmltojson.model.mt103.PartyIdentification();
                creditor.setName(txInfo.getCdtr().getNm());
                mt103Tx.setCreditor(creditor);
            }
            
            // Map creditor account
            if (txInfo.getCdtrAcct() != null && txInfo.getCdtrAcct().getId() != null) {
                com.example.xmltojson.model.mt103.Account creditorAcct = 
                    new com.example.xmltojson.model.mt103.Account();
                com.example.xmltojson.model.mt103.AccountIdentification creditorAcctId = 
                    new com.example.xmltojson.model.mt103.AccountIdentification();
                creditorAcctId.setIban(txInfo.getCdtrAcct().getId().getIban());
                creditorAcct.setId(creditorAcctId);
                mt103Tx.setCreditorAccount(creditorAcct);
            }
            
            // Map amount
            if (txInfo.getAmt() != null && txInfo.getAmt().getInstdAmt() != null) {
                com.example.xmltojson.model.mt103.Amount amount = 
                    new com.example.xmltojson.model.mt103.Amount();
                try {
                    amount.setInstructedAmount(new java.math.BigDecimal(txInfo.getAmt().getInstdAmt().getValue()));
                    amount.setCurrency(txInfo.getAmt().getInstdAmt().getCcy());
                    mt103Tx.setSettlementAmount(amount);
                } catch (NumberFormatException e) {
                    // Log error or handle invalid amount format
                    System.err.println("Invalid amount format: " + txInfo.getAmt().getInstdAmt().getValue());
                }
            }
            
            // Map remittance information
            if (txInfo.getRmtInf() != null) {
                com.example.xmltojson.model.mt103.RemittanceInformation remittance = 
                    new com.example.xmltojson.model.mt103.RemittanceInformation();
                remittance.setUnstructured(txInfo.getRmtInf().getUstrd());
                mt103Tx.setRemittanceInformation(remittance);
            }
        }
        
        mt103Tx.setPaymentId(pmtId);
        
        // Map debtor information
        if (paymentInfo.getDbtr() != null) {
            com.example.xmltojson.model.mt103.PartyIdentification debtor = 
                new com.example.xmltojson.model.mt103.PartyIdentification();
            debtor.setName(paymentInfo.getDbtr().getNm());
            mt103Tx.setDebtor(debtor);
        }
        
        // Map debtor account
        if (paymentInfo.getDbtrAcct() != null && paymentInfo.getDbtrAcct().getId() != null) {
            com.example.xmltojson.model.mt103.Account debtorAcct = 
                new com.example.xmltojson.model.mt103.Account();
            com.example.xmltojson.model.mt103.AccountIdentification debtorAcctId = 
                new com.example.xmltojson.model.mt103.AccountIdentification();
            debtorAcctId.setIban(paymentInfo.getDbtrAcct().getId().getIban());
            debtorAcct.setId(debtorAcctId);
            mt103Tx.setDebtorAccount(debtorAcct);
        }
        
        return mt103Tx;
    }

    private LocalDateTime parseDateTime(String dateTimeStr) {
        try {
            return LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ISO_DATE_TIME);
        } catch (Exception e) {
            return LocalDateTime.now();
        }
    }
}
