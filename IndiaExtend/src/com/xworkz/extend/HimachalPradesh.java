package com.xworkz.extend;

public class HimachalPradesh extends HimachalPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Himachal Pradesh is a scenic mountainous state in northern India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Snow Leopard, native to high altitudes, is the state animal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Western Tragopan, a colorful pheasant, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Cricket is widely played across the beautiful hills of Himachal.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Pink Rhododendron, a vibrant bloom, is the state flower.");
    }
}
