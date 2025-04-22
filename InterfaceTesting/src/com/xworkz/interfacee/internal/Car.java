package com.xworkz.interfacee.internal;

//.Transport;

public class Car implements Transport {
    public Car() {
        System.out.println("✅ Car object created");
    }

    @Override
    public void action() {
        System.out.println("Car is performing its Transport action.");
    }
}
