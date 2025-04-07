package com.xworkz.extend;

public class Chandigarh extends ChandigarhParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Chandigarh is a Union Territory and serves as the capital of both Punjab and Haryana.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Indian Grey Mongoose is the state animal of Chandigarh, known for its agility.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Indian Grey Hornbill is the state bird, recognized by its distinctive beak.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Cricket is the most popular and widely played sport in Chandigarh.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Dhak Flower, also called Flame of the Forest, is the state flower of Chandigarh.");
    }

    void capitalOfStates() {
        System.out.println("Capital Of: Chandigarh is the capital of both Punjab and Haryana.");
    }

    void languagesSpoken() {
        System.out.println("Languages: Punjabi, Hindi, and English.");
    }

    void famousFood() {
        System.out.println("Famous Food: Chole Bhature, Butter Chicken, and Lassi.");
    }

    void touristSpots() {
        System.out.println("Tourist Spots: Rock Garden, Sukhna Lake, and Rose Garden.");
    }

    void designedBy() {
        System.out.println("Designed By: Le Corbusier, a famous French architect.");
    }
}
