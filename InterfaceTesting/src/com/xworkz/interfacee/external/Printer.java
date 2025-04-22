package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Document;

public class Printer {
    private Document ref;

    public Printer(Document ref) {
        this.ref = ref;
        System.out.println("💡 Printer created with Document dependency");
    }

    public void use() {
        ref.action();
    }
}
