package com.example.monitoring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.composite.CompositeMeterRegistry;

@Configuration
public class AppConfig {
    @Bean    
    public CompositeMeterRegistry getCompositeMeterRegistry() {
        CompositeMeterRegistry meterRegistry = new CompositeMeterRegistry();        
        return meterRegistry;    
    }
}