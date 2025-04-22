package com.xworkz.interfacee.internal;

//.Framework;

public class Spring implements Framework {
    public Spring() {
        System.out.println("✅ Spring object created");
    }

    @Override
    public void action() {
        System.out.println("Spring is performing its Framework action.");
    }
}
