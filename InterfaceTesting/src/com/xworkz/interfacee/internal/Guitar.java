package com.xworkz.interfacee.internal;

//.Music;

public class Guitar implements Music {
    public Guitar() {
        System.out.println("✅ Guitar object created");
    }

    @Override
    public void action() {
        System.out.println("Guitar is performing its Music action.");
    }
}
