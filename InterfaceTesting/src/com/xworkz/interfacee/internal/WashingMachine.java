package com.xworkz.interfacee.internal;

//.Appliance;

public class WashingMachine implements Appliance {
    public WashingMachine() {
        System.out.println("✅ WashingMachine object created");
    }

    @Override
    public void action() {
        System.out.println("WashingMachine is performing its Appliance action.");
    }
}
