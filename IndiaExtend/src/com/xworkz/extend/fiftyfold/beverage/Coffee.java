package com.xworkz.extend.fiftyfold.beverage;

public class Coffee extends Beverage{
    public Coffee() {
        super();
        System.out.println("Running non-arg constructor of Coffee");
    }
    @Override
    public void drink() {
        System.out.println("Coffe is for drinking");
    }
    public void temperature() {
        System.out.println("Coffe Beverage can be hot or cold");
    }
    public void flavor() {
        System.out.println("Coffe Beverage has different flavors");
    }
    public void refresh() {
        System.out.println("Coffe Beverage is refreshing");
    }
}
