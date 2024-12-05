package com.saideepak;

public class Student {
    int age = 0;
    Computer comp;

    public Student() {
        System.out.println("Student object created");
    }

    public Student(int age, Computer comp) {
        System.out.println("Student object created with age and "+comp.toString());
        this.age = age;
        this.comp = comp;
    }

    public Student(int age) {
        System.out.println("Student object created with age");
        this.age = age;
    }

    public Student(Computer comp) {
        System.out.println("Student object created with "+comp.toString());
        this.comp = comp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code() {
        comp.compile();
        System.out.println("Coding Complete :P");
    }
}