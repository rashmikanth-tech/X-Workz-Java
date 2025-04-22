package com.xworkz.interfacee.internal;

//.Sport;

public class Cricket implements Sport {
    public Cricket() {
        System.out.println("✅ Cricket object created");
    }

    @Override
    public void action() {
        System.out.println("Cricket is performing its Sport action.");
    }
}
