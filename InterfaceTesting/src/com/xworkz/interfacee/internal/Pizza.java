package com.xworkz.interfacee.internal;

//.Food;

public class Pizza implements Food {
    public Pizza() {
        System.out.println("✅ Pizza object created");
    }

    @Override
    public void action() {
        System.out.println("Pizza is performing its Food action.");
    }
}
