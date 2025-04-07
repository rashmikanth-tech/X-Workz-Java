package com.xworkz.extend;

public class AndhraPradesh extends AndhraPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Andhra Pradesh is located in the southeastern part of India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Blackbuck is known for its grace and speed.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Indian Roller, called 'Pala Pitta' in Telugu, is the state bird.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kabaddi is a widely played traditional sport.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Jasmine, known for its fragrance, is the state flower.");
    }

    // Additional methods specific to Andhra Pradesh
    void capital() {
        System.out.println("Capital: Amaravati (Proposed), Hyderabad (de facto till 2024)");
    }

    void language() {
        System.out.println("Language: Telugu");
    }

    void population() {
        System.out.println("Population: Around 49 million");
    }

    void famousFood() {
        System.out.println("Famous Food: Pulihora, Andhra Chicken Curry, Gongura Pickle");
    }

    void touristSpot() {
        System.out.println("Tourist Spot: Araku Valley, Tirupati, Vijayawada Kanaka Durga Temple");
    }
}
