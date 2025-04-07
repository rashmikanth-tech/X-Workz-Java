package com.xworkz.extend;

public class Lotion extends LotionParent {

    @Override
    void category() {
        System.out.println("Overridden: Lotion is an essential skin care product for daily moisturizing.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Key Ingredient includes Aloe Vera and Shea Butter for nourishment.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Lotion keeps skin hydrated, soft, and helps prevent dryness.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Best used after a shower or before bed for long-lasting hydration.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Popular lotion brands include Nivea, Vaseline, Cetaphil, and Himalaya.");
    }
}
