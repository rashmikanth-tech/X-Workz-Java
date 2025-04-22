package com.xworkz.interfacee.internal;

//.Document;

public class PDF implements Document {
    public PDF() {
        System.out.println("✅ PDF object created");
    }

    @Override
    public void action() {
        System.out.println("PDF is performing its Document action.");
    }
}
