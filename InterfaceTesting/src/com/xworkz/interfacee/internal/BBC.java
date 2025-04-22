package com.xworkz.interfacee.internal;

//.News;

public class BBC implements News {
    public BBC() {
        System.out.println("✅ BBC object created");
    }

    @Override
    public void action() {
        System.out.println("BBC is performing its News action.");
    }
}
