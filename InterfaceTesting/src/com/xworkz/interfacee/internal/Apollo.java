package com.xworkz.interfacee.internal;


public class Apollo implements Hospital {
    public Apollo() {
        System.out.println("✅ Apollo object created");
    }

    @Override
    public void action() {
        System.out.println("Apollo is performing its Hospital action.");
    }
}
