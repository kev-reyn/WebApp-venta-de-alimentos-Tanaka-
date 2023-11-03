package com.example.tanaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TanakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TanakaApplication.class, args);
    }

}
