package com.xworkz.interfacee.internal;

//.Security;

public class Firewall implements Security {
    public Firewall() {
        System.out.println("✅ Firewall object created");
    }

    @Override
    public void action() {
        System.out.println("Firewall is performing its Security action.");
    }
}
