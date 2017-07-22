package com.transapp.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages = {"com.transapp"})
@ImportResource("application-context.xml")
public class Application implements CommandLineRunner
{
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... strings) throws Exception
    {
//        log.info("Creating tables");
//        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS aaas(ID INT PRIMARY KEY, NAME VARCHAR(255))");
    }
}
