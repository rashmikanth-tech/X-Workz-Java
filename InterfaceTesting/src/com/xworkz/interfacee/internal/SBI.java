package com.xworkz.interfacee.internal;

//.Bank;

public class SBI implements Bank {
    public SBI() {
        System.out.println("✅ SBI object created");
    }

    @Override
    public void action() {
        System.out.println("SBI is performing its Bank action.");
    }
}
