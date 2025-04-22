package com.xworkz.interfacee.internal;

//.Tool;

public class Hammer implements Tool {
    public Hammer() {
        System.out.println("✅ Hammer object created");
    }

    @Override
    public void action() {
        System.out.println("Hammer is performing its Tool action.");
    }
}
