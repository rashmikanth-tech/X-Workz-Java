package com.xworkz.extend;

public class ArunachalPradesh extends ArunachalPradeshParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Arunachal Pradesh is the northeasternmost state of India, known as the Land of the Rising Sun.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Mithun, also known as gayal, is a semi-domesticated bovine found in the region.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Great Hornbill is a majestic bird symbolizing strength and grandeur.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Archery is a traditional and culturally important sport in Arunachal Pradesh.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Foxtail Orchid, with its beautiful blooms, represents the natural beauty of the state.");
    }

    // Extra details about the state
    void capital() {
        System.out.println("Capital: Itanagar");
    }

    void language() {
        System.out.println("Language: English (official), with many tribal dialects");
    }

    void population() {
        System.out.println("Population: Around 1.5 million");
    }

    void famousFood() {
        System.out.println("Famous Food: Thukpa, Bamboo Shoot Curry, Apong (rice beer)");
    }

    void touristSpot() {
        System.out.println("Tourist Spot: Tawang Monastery, Ziro Valley, Sela Pass");
    }
}
