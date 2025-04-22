package com.xworkz.interfacee.internal;

//.Game;

public class Football implements Game {
    public Football() {
        System.out.println("✅ Football object created");
    }

    @Override
    public void action() {
        System.out.println("Football is performing its Game action.");
    }
}
