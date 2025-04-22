package com.xworkz.interfacee.internal;

//.OS;

public class Linux implements OS {
    public Linux() {
        System.out.println("✅ Linux object created");
    }

    @Override
    public void action() {
        System.out.println("Linux is performing its OS action.");
    }
}
