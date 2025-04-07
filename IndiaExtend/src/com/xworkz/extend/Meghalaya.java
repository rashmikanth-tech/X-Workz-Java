package com.xworkz.extend;

public class Meghalaya extends MeghalayaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Meghalaya, meaning 'Abode of Clouds', is located in northeast India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Clouded Leopard, known for its camouflage, is Meghalaya’s state animal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Hill Myna, famous for its ability to mimic sounds, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is deeply loved and widely played across Meghalaya.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Lady’s Slipper Orchid, a rare and exotic flower, is the state flower.");
    }
}
