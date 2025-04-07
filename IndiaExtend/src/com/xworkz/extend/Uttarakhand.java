package com.xworkz.extend;

public class Uttarakhand extends UttarakhandParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Uttarakhand is known as the 'Land of the Gods' in India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Alpine Musk Deer is the state animal of Uttarakhand.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Himalayan Monal, a colorful bird, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is a popular state sport in Uttarakhand.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Brahma Kamal is a sacred flower and state flower of Uttarakhand.");
    }
}
