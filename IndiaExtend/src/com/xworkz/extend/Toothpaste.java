package com.xworkz.extend;

public class Toothpaste extends ToothpasteParent {

    @Override
    void category() {
        System.out.println("Overridden Category: Toothpaste is used for daily oral hygiene.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden Key Ingredient: Fluoride helps in fighting tooth decay.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden Benefits: Fights plaque, freshens breath, and whitens teeth.");
    }

    @Override
    void usage() {
        System.out.println("Overridden Usage: Brush twice daily for 2 minutes each time.");
    }

    @Override
    void brands() {
        System.out.println("Overridden Brands: Includes Colgate, Dabur Red, Himalaya, and Close-Up.");
    }
}
