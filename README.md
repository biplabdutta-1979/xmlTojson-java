# XML to JSON Transformation Java Application

This application converts PAIN.001 XML files to MT103 JSON messages via REST APIs.

## Features
- REST endpoint to accept PAIN.001 XML as text input and return MT103 JSON (and log output)
- REST endpoint to process N XML files, convert each to MT103 JSON (batch mode)
- Common translator service for XML to JSON mapping
- Output object includes: transformed JSON, transformation start/end timestamp, and time taken
- Async service writes transformation results to CSV (filename, starttime, endtime, totaltimetaken, sizeofFile)
- Unit tests and sample PAIN.001 XML included

## Tech Stack
- Java 17+
- Spring Boot (REST APIs, async processing)
- Jackson (JSON)
- JAXB (XML parsing)
- OpenCSV (CSV writing)
- JUnit (Testing)

## Project Structure
- `src/main/java/com/example/xmltojson/`
  - `controller/` REST controllers
  - `service/` Business logic and transformation
  - `model/` Data models
  - `util/` Utility classes
- `src/test/java/com/example/xmltojson/` Unit tests
- `src/main/resources/sample/` Sample PAIN.001 XML files

## Running the App
1. Build: `./mvnw clean install`
2. Run: `./mvnw spring-boot:run`

## API Endpoints
- `POST /api/transform/single` - Accepts PAIN.001 XML as text
- `POST /api/transform/batch` - Accepts number N, processes N XML files

## Sample PAIN.001 XML
See `src/main/resources/sample/pain001-sample.xml`

---
