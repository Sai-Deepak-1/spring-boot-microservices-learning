package com.saideepak.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    Laptop lp;

    public void codes() {
        System.out.println("Student does Coding");
        lp.compile();
    }
}
