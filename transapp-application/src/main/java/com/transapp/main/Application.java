package com.focus.service.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication(scanBasePackages = {"com.focus.service"})
@ImportResource("application-context.xml")
@EnableMongoRepositories(basePackages = {"com.focus.service.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        
    }
}

