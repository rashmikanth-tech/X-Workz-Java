package com.xworkz.extend;

public class Punjab extends PunjabParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Punjab is a vibrant state in northern India, known for its rich culture and history.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Blackbuck, known for its speed and spiral horns, is the state animal of Punjab.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Northern Goshawk, a powerful bird of prey, represents the avian wildlife of Punjab.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kabaddi, a high-energy contact sport, is deeply rooted in Punjab's rural traditions.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Gladiolus, known for its sword-shaped leaves and vibrant flowers, is Punjab’s state flower.");
    }
}
