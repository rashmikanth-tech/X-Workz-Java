package com.xworkz.interfacee.internal;

//.Art;

public class Painting implements Art {
    public Painting() {
        System.out.println("✅ Painting object created");
    }

    @Override
    public void action() {
        System.out.println("Painting is performing its Art action.");
    }
}
