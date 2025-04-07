package com.xworkz.extend;

public class Assam extends AssamParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Assam is known for its tea plantations and rich biodiversity.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: State Animal: One-horned Rhinoceros, found in Kaziranga National Park.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: State Bird: White-winged Duck, a rare and endangered species.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: State Sport: Football is highly popular in Assam.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: State Flower: Fox Tail Orchid, symbol of beauty and grace.");
    }

    void capital() {
        System.out.println("Capital: Dispur");
    }

    void language() {
        System.out.println("Language: Assamese");
    }

    void population() {
        System.out.println("Population: Around 36 million");
    }

    void famousFood() {
        System.out.println("Famous Food: Khar, Masor Tenga, Aloo Pitika");
    }

    void touristSpot() {
        System.out.println("Tourist Spot: Kaziranga National Park, Majuli Island, Kamakhya Temple");
    }
}
