package com.xworkz.extend;

public class Jharkhand extends JharkhandParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Jharkhand is a mineral-rich state located in eastern India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Indian Elephant is the state animal of Jharkhand.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Asian Koel, known for its melodious call, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Hockey is widely played and promoted in Jharkhand.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The vibrant Palash flower symbolizes the state of Jharkhand.");
    }
}
