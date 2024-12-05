package com.saideepak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext actx = new ClassPathXmlApplicationContext("spring-context.xml");
        Student stu = (Student) actx.getBean("student");
        System.out.println("Student age is : "+stu.getAge());
        stu.code();
    }
}
