package com.example.cwiczenia2sztucznainteligencja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Cwiczenia2sztucznaInteligencjaApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cwiczenia2sztucznaInteligencjaApplication.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
