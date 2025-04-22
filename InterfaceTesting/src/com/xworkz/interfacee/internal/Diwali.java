package com.xworkz.interfacee.internal;

//.Festival;

public class Diwali implements Festival {
    public Diwali() {
        System.out.println("✅ Diwali object created");
    }

    @Override
    public void action() {
        System.out.println("Diwali is performing its Festival action.");
    }
}
