package com.saideepak.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class CPU {
    public void process() {
        System.out.println("Processing the Code...");
    }
}
