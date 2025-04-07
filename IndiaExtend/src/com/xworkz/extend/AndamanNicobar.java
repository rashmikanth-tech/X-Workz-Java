package com.xworkz.extend;

public class AndamanNicobar extends AndamanNicobarParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Andaman and Nicobar Islands are known for pristine beaches and tropical rainforests.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Dugong, also known as the sea cow, is a rare marine animal found here.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: Andaman Wood Pigeon is a beautiful bird endemic to these islands.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Scuba diving is a major sport and tourist attraction.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: The Andaman Padauk tree is used for quality furniture and woodwork.");
    }

    // Additional methods specific to subclass
    void capital() {
        System.out.println("Capital: Port Blair");
    }

    void language() {
        System.out.println("Language: Hindi, English");
    }

    void population() {
        System.out.println("Population: 0.4 million");
    }

    void famousFood() {
        System.out.println("Famous Food: Seafood Curry");
    }

    void touristSpot() {
        System.out.println("Tourist Spot: Radhanagar Beach");
    }
}
