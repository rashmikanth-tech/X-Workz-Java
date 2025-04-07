package com.xworkz.extend;

public class Supernova extends SupernovaParent {

    @Override
    void category() {
        System.out.println("Overridden Category: Supernova is a powerful stellar explosion");
    }

    @Override
    void typesOfSupernovae() {
        System.out.println("Overridden Types: Includes Type Ia (Thermonuclear) and Type II (Core Collapse)");
    }

    @Override
    void supernovaBrightness() {
        System.out.println("Overridden Brightness: Can briefly outshine an entire galaxy");
    }

    @Override
    void supernovaFormation() {
        System.out.println("Overridden Formation: Happens at the end of a massive star’s life cycle");
    }

    @Override
    void elementsFromSupernova() {
        System.out.println("Overridden Elements: Responsible for forming elements like Gold, Iron, Uranium");
    }
}
