package com.xworkz.extend;

public class Kerala extends KeralaParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Kerala is a scenic coastal state in southern India known for its backwaters.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Indian Elephant symbolizes the cultural heritage of Kerala.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Great Hornbill, known for its large beak, is Kerala's pride.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kalaripayattu, one of the oldest martial arts, originates from Kerala.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Golden Shower Tree, locally known as 'Konna', blooms during Vishu festival.");
    }
}
