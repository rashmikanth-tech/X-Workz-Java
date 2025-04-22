package com.xworkz.interfacee.internal;

//.Color;

public class Red implements Color {
    public Red() {
        System.out.println("✅ Red object created");
    }

    @Override
    public void action() {
        System.out.println("Red is performing its Color action.");
    }
}
