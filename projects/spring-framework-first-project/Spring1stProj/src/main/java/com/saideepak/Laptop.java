package com.saideepak;

public class Laptop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling the Code on Laptop");
    }

    @Override
    public String toString() {
        return "Laptop";
    }
}
