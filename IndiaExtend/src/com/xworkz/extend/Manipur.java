package com.xworkz.extend;

public class Manipur extends ManipurParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Manipur, located in northeast India, is known as the 'Jewel of India'.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Sangai Deer, also called the 'Dancing Deer', is found only in Manipur.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: Mrs. Hume’s Pheasant is a rare and beautiful bird native to this region.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Polo, believed to have originated here, is a traditional sport in Manipur.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Shirui Lily grows only on the Shirui Hills and is unique to Manipur.");
    }
}
