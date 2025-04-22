package com.xworkz.interfacee.internal;

//.Engine;

public class DieselEngine implements Engine {
    public DieselEngine() {
        System.out.println("✅ DieselEngine object created");
    }

    @Override
    public void action() {
        System.out.println("DieselEngine is performing its Engine action.");
    }
}
