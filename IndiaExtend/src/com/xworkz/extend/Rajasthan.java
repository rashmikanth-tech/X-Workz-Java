package com.xworkz.extend;

public class Rajasthan extends RajasthanParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Rajasthan, the largest state in India, is known for its deserts and royal heritage.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Camel, also known as the 'Ship of the Desert', is Rajasthan’s state animal and a vital part of desert life.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Great Indian Bustard, a critically endangered species, is the state bird of Rajasthan.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Though Basketball is promoted, traditional sports like Camel racing and Polo are also popular in Rajasthan.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Rohida flower, native to arid regions, represents the floral identity of Rajasthan.");
    }
}
