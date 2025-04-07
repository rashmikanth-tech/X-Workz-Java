package com.xworkz.extend;

public class Desert extends DesertParent {

    @Override
    void category() {
        System.out.println("Overridden: Deserts are arid regions with minimal precipitation.");
    }

    @Override
    void largestDesert() {
        System.out.println("Overridden: Antarctica is the world's largest cold desert.");
    }

    @Override
    void hottestDesert() {
        System.out.println("Overridden: The Sahara Desert is the hottest desert on Earth.");
    }

    @Override
    void averageRainfall() {
        System.out.println("Overridden: Deserts typically receive less than 250 mm of rain annually.");
    }

    @Override
    void desertFlora() {
        System.out.println("Overridden: Desert flora includes cactus, shrubs, and drought-resistant plants.");
    }

    void desertFauna() {
        System.out.println("Desert Fauna: Includes camels, foxes, snakes, and scorpions.");
    }

    void temperatureRange() {
        System.out.println("Temperature Range: Very hot during the day and cold at night.");
    }

    void typesOfDeserts() {
        System.out.println("Types: Hot deserts and cold deserts.");
    }

    void adaptations() {
        System.out.println("Adaptations: Both flora and fauna have unique adaptations to survive harsh conditions.");
    }

    void famousDeserts() {
        System.out.println("Famous Deserts: Sahara, Gobi, Mojave, Kalahari.");
    }
}
