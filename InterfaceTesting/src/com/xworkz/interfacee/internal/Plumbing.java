package com.xworkz.interfacee.internal;

//.Service;

public class Plumbing implements Service {
    public Plumbing() {
        System.out.println("✅ Plumbing object created");
    }

    @Override
    public void action() {
        System.out.println("Plumbing is performing its Service action.");
    }
}
