package com.xworkz.extend;

public class HairGel extends HairGelParent {

    @Override
    void category() {
        System.out.println("Overridden: Hair gel is a personal care product used to style hair and keep it in place.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Common ingredients include Aloe Vera, Vitamin B5, and styling polymers.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Hair gel provides long-lasting hold, adds shine, and helps control frizz.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Use on slightly wet or dry hair. Style using hands or a comb.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Top brands include Gatsby, L'Oréal, Schwarzkopf, and Set Wet.");
    }

    // Optional additional method
    void hairTypeCompatibility() {
        System.out.println("Compatible with all hair types, especially short to medium-length hair.");
    }
}
