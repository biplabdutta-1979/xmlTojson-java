package com.example.xmltojson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {
    
    @Bean(name = "transformationTaskExecutor")
    public Executor transformationTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);  // Increased core pool size
        executor.setMaxPoolSize(10);   // Increased max pool size
        executor.setQueueCapacity(10000); // Increased queue capacity
        executor.setThreadNamePrefix("transformation-thread-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
    
    @Bean(name = "csvWriterTaskExecutor")
    public Executor csvWriterTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(4);  // Increased core pool size
        executor.setMaxPoolSize(10);   // Increased max pool size
        executor.setQueueCapacity(10000); // Increased queue capacity
        executor.setThreadNamePrefix("csv-writer-thread-");
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}