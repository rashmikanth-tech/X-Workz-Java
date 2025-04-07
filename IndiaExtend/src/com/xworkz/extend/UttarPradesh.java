package com.xworkz.extend;

public class UttarPradesh extends UttarPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Uttar Pradesh is a culturally rich state in northern India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: Barasingha, also known as swamp deer, is the state animal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: Sarus Crane is the tallest flying bird and state bird of UP.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Wrestling, a traditional sport, is very popular in Uttar Pradesh.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Palash, also called 'Flame of the Forest', is the state flower.");
    }
}
