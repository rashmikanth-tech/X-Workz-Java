package com.xworkz.interfacee.internal;

//.Clothing;

public class TShirt implements Clothing {
    public TShirt() {
        System.out.println("✅ TShirt object created");
    }

    @Override
    public void action() {
        System.out.println("TShirt is performing its Clothing action.");
    }
}
