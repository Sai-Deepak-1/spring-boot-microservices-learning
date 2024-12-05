package com.saideepak;

public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling the Code on Desktop");
    }

    @Override
    public String toString() {
        return "Desktop";
    }
}
