package com.xworkz.interfacee.internal;

//.Vehicle;

public class Bike implements Vehicle {
    public Bike() {
        System.out.println("✅ Bike object created");
    }

    @Override
    public void action() {
        System.out.println("Bike is performing its Vehicle action.");
    }
}
