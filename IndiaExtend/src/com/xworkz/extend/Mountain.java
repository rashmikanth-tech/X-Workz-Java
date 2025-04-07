package com.xworkz.extend;

public class Mountain extends MountainParent {

    @Override
    void category() {
        System.out.println("Overridden: Mountains are elevated landforms rising prominently above the surrounding terrain.");
    }

    @Override
    void highestPeak() {
        System.out.println("Overridden: Mount Everest is the highest peak, standing at 8,848 meters.");
    }

    @Override
    void mountainRange() {
        System.out.println("Overridden: The Himalayas form the world's highest mountain range.");
    }

    @Override
    void climate() {
        System.out.println("Overridden: Mountain climates are typically cold, windy, and can vary drastically with altitude.");
    }

    @Override
    void famousTrek() {
        System.out.println("Overridden: The Everest Base Camp trek is one of the most iconic high-altitude treks.");
    }
}
