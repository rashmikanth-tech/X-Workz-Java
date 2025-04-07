package com.xworkz.extend;

public class Chhattisgarh extends ChhattisgarhParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Chhattisgarh is a mineral-rich state located in central India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Wild Buffalo, also known as the Indian Bison, is the state animal of Chhattisgarh.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Hill Myna, known for its mimicking ability, is Chhattisgarh’s state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kabaddi is the traditional and most popular sport in Chhattisgarh.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Sal Tree Flower is the state flower and is widely found in Chhattisgarh’s forests.");
    }
}