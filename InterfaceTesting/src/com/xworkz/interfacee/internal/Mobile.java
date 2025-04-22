package com.xworkz.interfacee.internal;

//.Device;

public class Mobile implements Device {
    public Mobile() {
        System.out.println("✅ Mobile object created");
    }

    @Override
    public void action() {
        System.out.println("Mobile is performing its Device action.");
    }
}
