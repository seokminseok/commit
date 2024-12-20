package com.lsm.declaration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DeclarationApplication {

    public static void main(String[] args) {

        System.setProperty("spring.devtools.restart.enabled", "false");SpringApplication.run(DeclarationApplication.class, args);
    }

}
