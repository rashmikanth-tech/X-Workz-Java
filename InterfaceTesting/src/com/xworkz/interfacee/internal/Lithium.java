package com.xworkz.interfacee.internal;

//.Battery;

public class Lithium implements Battery {
    public Lithium() {
        System.out.println("✅ Lithium object created");
    }

    @Override
    public void action() {
        System.out.println("Lithium is performing its Battery action.");
    }
}
