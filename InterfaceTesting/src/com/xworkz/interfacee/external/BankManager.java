package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Bank;

public class BankManager {
    private Bank ref;

    public BankManager(Bank ref) {
        this.ref = ref;
        System.out.println("💡 BankManager created with Bank dependency");
    }

    public void use() {
        ref.action();
    }
}
