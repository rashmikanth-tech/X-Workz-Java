package com.xworkz.interfacee.internal;

//.Sensor;

public class TemperatureSensor implements Sensor {
    public TemperatureSensor() {
        System.out.println("✅ TemperatureSensor object created");
    }

    @Override
    public void action() {
        System.out.println("TemperatureSensor is performing its Sensor action.");
    }
}
