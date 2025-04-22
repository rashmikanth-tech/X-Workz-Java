package com.xworkz.interfacee.internal;

//.Browser;

public class Chrome implements Browser {
    public Chrome() {
        System.out.println("✅ Chrome object created");
    }

    @Override
    public void action() {
        System.out.println("Chrome is performing its Browser action.");
    }
}
