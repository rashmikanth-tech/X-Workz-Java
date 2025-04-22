package com.xworkz.interfacee.internal;

//.TransportService;

public class Uber implements TransportService {
    public Uber() {
        System.out.println("✅ Uber object created");
    }

    @Override
    public void action() {
        System.out.println("Uber is performing its TransportService action.");
    }
}
