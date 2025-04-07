package com.xworkz.extend;

public class TamilNadu extends TamilNaduParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden Info: Tamil Nadu is located in the southern part of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden Animal: The Nilgiri Tahr is an endangered mountain goat species.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden Bird: The Emerald Dove is known for its beautiful green feathers.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden Sport: Jallikattu is a traditional bull-taming sport.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden Flower: Glory Lily, known for its striking red and yellow petals.");
    }
}
