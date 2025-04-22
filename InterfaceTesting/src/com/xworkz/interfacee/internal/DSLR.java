package com.xworkz.interfacee.internal;

//.Camera;

public class DSLR implements Camera {
    public DSLR() {
        System.out.println("✅ DSLR object created");
    }

    @Override
    public void action() {
        System.out.println("DSLR is performing its Camera action.");
    }
}
