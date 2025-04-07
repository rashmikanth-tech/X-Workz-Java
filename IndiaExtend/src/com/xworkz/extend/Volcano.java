package com.xworkz.extend;

public class Volcano extends VolcanoParent {

    @Override
    void category() {
        System.out.println("Overridden: A volcano is a rupture in Earth's crust where magma erupts.");
    }

    @Override
    void mostActiveVolcano() {
        System.out.println("Overridden: Kilauea in Hawaii is one of the most active volcanoes.");
    }

    @Override
    void highestVolcano() {
        System.out.println("Overridden: Ojos del Salado in the Andes is the world's highest volcano.");
    }

    @Override
    void eruptionFrequency() {
        System.out.println("Overridden: Some volcanoes erupt every few years, others lie dormant for centuries.");
    }

    @Override
    void lavaComposition() {
        System.out.println("Overridden: Basaltic lava is low in silica, allowing fluid eruptions.");
    }
}
