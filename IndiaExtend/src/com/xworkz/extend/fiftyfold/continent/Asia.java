package com.xworkz.extend.fiftyfold.continent;

public class Asia extends Continent {
    public Asia() {
        super();
        System.out.println("Running non-arg constructor Asia");
    }
    @Override
    public void countries() {
        System.out.println("Asia has multiple countries");
    }
    public void population() {
        System.out.println("Asia has a large population");
    }
    public void culture() {
        System.out.println("Asia has diverse cultures");
    }
    public void economy() {
        System.out.println("Asia contributes to the global economy");
    }
    public void climate() {
        System.out.println("Asia has different climates");
    }

}
