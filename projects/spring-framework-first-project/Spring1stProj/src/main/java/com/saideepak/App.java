package com.saideepak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

//        System.out.println("Hello World! \uD83D\uDE0E");
        ApplicationContext actx = new ClassPathXmlApplicationContext("spring-context.xml");
        Student stu = (Student) actx.getBean("student");
//        stu.setAge(20);
        System.out.println(stu.getAge());
        stu.code();
    }
}
