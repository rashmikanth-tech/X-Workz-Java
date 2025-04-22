package com.xworkz.interfacee.internal;

//.Furniture;

public class Chair implements Furniture {
    public Chair() {
        System.out.println("✅ Chair object created");
    }

    @Override
    public void action() {
        System.out.println("Chair is performing its Furniture action.");
    }
}
