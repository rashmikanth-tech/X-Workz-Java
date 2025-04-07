package com.xworkz.extend;

public class MadhyaPradesh extends MadhyaPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Madhya Pradesh is known as the Heart of India due to its location.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Barasingha, also called swamp deer, is the state animal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Indian Paradise Flycatcher, known for its long tail, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Mallakhamb is a traditional sport practiced in Madhya Pradesh.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The White Lily symbolizes purity and is the state flower.");
    }
}
