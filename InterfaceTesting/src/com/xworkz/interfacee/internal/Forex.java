package com.xworkz.interfacee.internal;

//.CurrencyExchange;

public class Forex implements CurrencyExchange {
    public Forex() {
        System.out.println("✅ Forex object created");
    }

    @Override
    public void action() {
        System.out.println("Forex is performing its CurrencyExchange action.");
    }
}
