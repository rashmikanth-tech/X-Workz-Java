package com.xworkz.extend;

public class Mizoram extends MizoramParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Mizoram is a beautiful state located in the northeastern part of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Mizoram is the Serow, a unique goat-antelope species.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The state bird is Mrs. Hume’s Pheasant, known for its vibrant plumage.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is the most popular and celebrated sport in Mizoram.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Red Vanda, a type of orchid, is the state flower of Mizoram.");
    }
}
