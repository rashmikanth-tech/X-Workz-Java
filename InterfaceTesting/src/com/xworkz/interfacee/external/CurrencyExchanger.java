package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Currency;

public class CurrencyExchanger {
    private Currency ref;

    public CurrencyExchanger(Currency ref) {
        this.ref = ref;
        System.out.println("💡 CurrencyExchanger created with Currency dependency");
    }

    public void use() {
        ref.action();
    }
}
