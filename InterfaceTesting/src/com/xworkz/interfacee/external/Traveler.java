package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.CurrencyExchange;

public class Traveler {
    private CurrencyExchange ref;

    public Traveler(CurrencyExchange ref) {
        this.ref = ref;
        System.out.println("💡 Traveler created with CurrencyExchange dependency");
    }

    public void use() {
        ref.action();
    }
}
