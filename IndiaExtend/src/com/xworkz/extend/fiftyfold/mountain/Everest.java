package com.xworkz.extend.fiftyfold.mountain;

public class Everest extends Mountain {
    public Everest() {
        super();
        System.out.println("Running non-arg constructor Everest");
    }
    @Override
    public void height() {
        System.out.println("Everest has a height");
    }
    public void climate() {
        System.out.println("Everest has a unique climate");
    }
    public void location() {
        System.out.println("Everest is located in different regions");
    }
    public void trekking() {
        System.out.println("Everest is used for trekking");
    }
    public void wildlife() {
        System.out.println("Everest supports unique wildlife");
    }
}
