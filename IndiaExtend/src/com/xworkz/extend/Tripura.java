package com.xworkz.extend;

public class Tripura extends TripuraParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Tripura is a beautiful northeastern state of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Tripura is Phayre's Langur.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Green Imperial Pigeon is Tripura's state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is the most loved sport in Tripura.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Nageshwar is recognized as the state flower of Tripura.");
    }
}
