package com.xworkz.interfacee.internal;

//.Plant;

public class Rose implements Plant {
    public Rose() {
        System.out.println("✅ Rose object created");
    }

    @Override
    public void action() {
        System.out.println("Rose is performing its Plant action.");
    }
}
