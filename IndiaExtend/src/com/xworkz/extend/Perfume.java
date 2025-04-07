package com.xworkz.extend;

public class Perfume extends PerfumeParent {

    @Override
    void category() {
        System.out.println("Overridden: Perfume falls under the fragrance product category, used for personal scent.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Perfumes are primarily made using essential oils derived from flowers, spices, and herbs.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Perfumes not only enhance mood and confidence but also create lasting impressions.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: For best results, apply perfume to pulse points like the wrists, neck, and behind the ears.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Top perfume brands include Chanel No. 5, Dior Sauvage, Gucci Bloom, and many others.");
    }
}
