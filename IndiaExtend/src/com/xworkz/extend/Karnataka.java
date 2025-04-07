package com.xworkz.extend;

public class Karnataka extends KarnatakaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Karnataka is a culturally rich state in southern India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The majestic Indian Elephant is the state animal of Karnataka.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Indian Roller, also called 'Blue Jay', is Karnataka's state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kambala, a traditional buffalo race, is Karnataka's state sport.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Lotus is the elegant and sacred state flower of Karnataka.");
    }
}
