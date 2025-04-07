package com.xworkz.extend;

public class Mouthwash extends MouthwashParent {

    @Override
    void category() {
        System.out.println("Overridden: Mouthwash is a liquid oral hygiene product used to rinse the mouth.");
    }

    @Override
    void keyIngredient() {
        System.out.println("Overridden: Common ingredients include Chlorhexidine, Essential Oils, and Fluoride.");
    }

    @Override
    void benefits() {
        System.out.println("Overridden: Mouthwash helps reduce plaque, prevent cavities, and freshen breath.");
    }

    @Override
    void usage() {
        System.out.println("Overridden: Swish 20ml of mouthwash for 30 seconds after brushing.");
    }

    @Override
    void brands() {
        System.out.println("Overridden: Recommended brands include Listerine, Colgate Plax, and Therabreath.");
    }
}
