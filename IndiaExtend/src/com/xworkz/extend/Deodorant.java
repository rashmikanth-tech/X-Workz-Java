package com.xworkz.extend;

public class Deodorant extends DeodorantParent {

    @Override
    void category() {
        System.out.println("Overridden: Deodorant is a hygiene product used to mask body odor.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Common ingredients include aluminum compounds and fragrances.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Helps control perspiration and eliminates body odor.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Best used after a shower on dry underarms for all-day freshness.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Popular deodorant brands include Axe, Nivea, Dove, and Old Spice.");
    }

    void typesOfDeodorant() {
        System.out.println("Types: Roll-on, Spray, Stick, Gel.");
    }

    void fragranceDuration() {
        System.out.println("Fragrance Duration: Typically lasts from 6 to 24 hours depending on the type.");
    }

    void suitableFor() {
        System.out.println("Suitable For: Both men and women, with various skin-sensitive options.");
    }

    void precautions() {
        System.out.println("Precautions: Avoid applying on broken or irritated skin.");
    }

    void ecoFriendlyOptions() {
        System.out.println("Eco-Friendly: Some deodorants are made with natural ingredients and are plastic-free.");
    }
}
