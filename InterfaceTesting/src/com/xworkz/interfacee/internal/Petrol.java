package com.xworkz.interfacee.internal;

//.Fuel;

public class Petrol implements Fuel {
    public Petrol() {
        System.out.println("✅ Petrol object created");
    }

    @Override
    public void action() {
        System.out.println("Petrol is performing its Fuel action.");
    }
}
