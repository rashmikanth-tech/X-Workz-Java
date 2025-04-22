package com.xworkz.interfacee.internal;

//.Currency;

public class Rupee implements Currency {
    public Rupee() {
        System.out.println("✅ Rupee object created");
    }

    @Override
    public void action() {
        System.out.println("Rupee is performing its Currency action.");
    }
}
