package com.xworkz.interfacee.internal;

//.Laptop;

public class Dell implements Laptop {
    public Dell() {
        System.out.println("✅ Dell object created");
    }

    @Override
    public void action() {
        System.out.println("Dell is performing its Laptop action.");
    }
}
