package com.xworkz.interfacee.internal;



public class Alexa implements SmartDevice {
    public Alexa() {
        System.out.println("✅ Alexa object created");
    }

    @Override
    public void action() {
        System.out.println("Alexa is performing its SmartDevice action.");
    }
}
