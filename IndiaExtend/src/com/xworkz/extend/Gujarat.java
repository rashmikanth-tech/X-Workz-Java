package com.xworkz.extend;

public class Gujarat extends GujaratParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Gujarat is a western state in India, known for its rich culture and heritage.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Gujarat is the Asiatic Lion, found in Gir Forest.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Greater Flamingo is the state bird of Gujarat.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Cricket is widely played and loved across Gujarat.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Marigold is the state flower, used in various cultural festivals.");
    }

    // Optional extra method
    void famousFood() {
        System.out.println("Famous Food: Dhokla, Thepla, and Fafda are some popular dishes of Gujarat.");
    }
}
