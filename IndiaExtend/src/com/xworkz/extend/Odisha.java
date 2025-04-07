package com.xworkz.extend;

public class Odisha extends OdishaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Odisha is an eastern Indian state on the Bay of Bengal, known for its rich culture and heritage.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Odisha is the Sambar Deer, known for its large size and majestic antlers.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: Odisha's state bird is the Indian Roller, often seen during festivals and known for its vibrant blue wings.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Field Hockey is the official sport of Odisha, with the state being a major supporter of Indian Hockey.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Ashoka flower, associated with love and fertility, is the state flower of Odisha.");
    }
}
