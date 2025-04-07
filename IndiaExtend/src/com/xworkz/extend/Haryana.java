package com.xworkz.extend;

public class Haryana extends HaryanaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Haryana is a culturally rich state in northern India, formed in 1966.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: Haryana's state animal is the Blackbuck, known for its graceful horns.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Black Francolin is Haryana’s state bird, admired for its unique call.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Wrestling is the most popular sport in Haryana, producing many Olympians.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Lotus, symbolizing purity and strength, is the state flower of Haryana.");
    }
}
