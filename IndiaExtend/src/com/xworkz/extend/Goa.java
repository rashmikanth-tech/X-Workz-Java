package com.xworkz.extend;

public class Goa extends GoaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Goa is the smallest state in India, known for its beaches and tourism.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The state animal of Goa is the Gaur, also known as the Indian Bison.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The state bird of Goa is the Flame-throated Bulbul.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Football is the most popular sport in Goa.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Jasmine is the state flower of Goa, known for its fragrance.");
    }

    // Optional additional method
    void famousFestival() {
        System.out.println("Famous Festival: Goa Carnival is one of the most vibrant festivals celebrated here.");
    }
}
