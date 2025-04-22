package com.xworkz.interfacee.internal;

//.Weather;

public class Rain implements Weather {
    public Rain() {
        System.out.println("✅ Rain object created");
    }

    @Override
    public void action() {
        System.out.println("Rain is performing its Weather action.");
    }
}
