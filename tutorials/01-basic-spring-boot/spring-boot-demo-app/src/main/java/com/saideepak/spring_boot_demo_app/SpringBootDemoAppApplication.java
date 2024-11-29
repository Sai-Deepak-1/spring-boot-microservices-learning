package com.saideepak.spring_boot_demo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoAppApplication.class, args);
        System.out.println("Hello World!");
    }

}
