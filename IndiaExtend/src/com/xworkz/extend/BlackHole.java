package com.xworkz.extend;

public class BlackHole extends BlackHoleParent {

    @Override
    void category() {
        System.out.println("Overridden: A black hole is a space region with gravity so strong that not even light can escape.");
    }

    @Override
    void eventHorizon() {
        System.out.println("Overridden: The event horizon is the boundary beyond which nothing can escape the black hole's gravity.");
    }

    @Override
    void blackHoleFormation() {
        System.out.println("Overridden: Black holes form when massive stars collapse under their own gravity after a supernova.");
    }

    @Override
    void typesOfBlackHoles() {
        System.out.println("Overridden: There are three main types of black holes: Stellar, Supermassive, and Intermediate.");
    }

    @Override
    void blackHoleHawkingRadiation() {
        System.out.println("Overridden: Hawking radiation is a theoretical prediction that black holes emit radiation and may eventually evaporate.");
    }

    void firstImageCaptured() {
        System.out.println("First Image: Captured in 2019 by the Event Horizon Telescope (M87*).");
    }

    void locatedIn() {
        System.out.println("Location Example: Sagittarius A* is the supermassive black hole at the center of our galaxy.");
    }

    void gravitationalWaves() {
        System.out.println("Gravitational Waves: Detected when black holes merge, as observed by LIGO.");
    }

    void blackHoleSizeRange() {
        System.out.println("Size Range: From a few kilometers to millions of kilometers in diameter.");
    }

    void interestingFact() {
        System.out.println("Interesting Fact: Time slows down near a black hole due to intense gravity (time dilation).");
    }
}
