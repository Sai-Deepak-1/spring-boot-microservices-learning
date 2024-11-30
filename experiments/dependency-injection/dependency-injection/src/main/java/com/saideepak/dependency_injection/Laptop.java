package com.saideepak.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
    @Autowired
    CPU c;

    public void compile() {
        c.process();
        System.out.println("Compiling the Code...");
    }
}
