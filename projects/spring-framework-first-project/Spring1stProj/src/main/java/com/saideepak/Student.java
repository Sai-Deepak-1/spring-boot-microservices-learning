package com.saideepak;

public class Student {
    int age = 0;

    public Student() {
        System.out.println("Student object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {

//        Laptop laptop = new Laptop();
//        laptop.compile();

        System.out.println("Coding");
    }
}
