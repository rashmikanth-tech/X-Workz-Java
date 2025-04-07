package com.xworkz.extend;

public class Shampoo extends ShampooParent {

    @Override
    void category() {
        System.out.println("Overridden: Shampoo is a personal care product used to clean hair and scalp by removing oil, dirt, and sweat.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Key ingredient includes Keratin, which helps rebuild hair structure and adds smoothness.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Shampoo not only cleanses the scalp but also strengthens hair roots, reduces dandruff, and improves hair texture.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Wet your hair, apply a small amount of shampoo, massage into scalp, and rinse thoroughly with water.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Well-known shampoo brands include Pantene for shine, Dove for moisture, and Head & Shoulders for dandruff control.");
    }
}
