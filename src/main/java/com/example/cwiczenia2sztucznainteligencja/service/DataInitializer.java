package com.example.cwiczenia2sztucznainteligencja.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final DataBaseService dataService;

    public DataInitializer(DataBaseService dataService) {
        this.dataService = dataService;
    }

    @Override
    public void run(String... args) {
        dataService.saveData();
    }
}
