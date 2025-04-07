package com.xworkz.extend;

public class Nagaland extends NagalandParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Nagaland is a northeastern state of India, rich in tribal culture.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Nagaland is the Mithun, a semi-domesticated bovine.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The state bird is Blyth’s Tragopan, known for its vibrant colors.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Traditional wrestling is a popular sport in Nagaland, celebrated in festivals.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Rhododendron is the state flower, symbolizing the natural beauty of Nagaland.");
    }
}
