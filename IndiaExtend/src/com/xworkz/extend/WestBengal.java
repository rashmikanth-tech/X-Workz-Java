package com.xworkz.extend;

public class WestBengal extends WestBengalParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: West Bengal is located in eastern India and shares its border with Bangladesh.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Fishing Cat is an adept swimmer and the state animal of West Bengal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The White-throated Kingfisher is known for its vibrant colors.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is the most loved and played sport in West Bengal.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Night-flowering Jasmine (Shiuli) is associated with Bengali festivals.");
    }
}
