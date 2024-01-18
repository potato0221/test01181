package com.ll.firstBridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ErdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErdApplication.class, args);
    }

}
