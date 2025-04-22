package com.xworkz.interfacee.internal;

//.Movie;

public class Inception implements Movie {
    public Inception() {
        System.out.println("✅ Inception object created");
    }

    @Override
    public void action() {
        System.out.println("Inception is performing its Movie action.");
    }
}
