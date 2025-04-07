package com.xworkz.extend;

public class Maharashtra extends MaharashtraParent {

    @Override
    void countryInfo() {
        System.out.println("Overridden: Maharashtra is a culturally rich state in western India.");
    }

    @Override
    void stateAnimal() {
        System.out.println("Overridden: The Indian Giant Squirrel is a vibrant and agile tree-dwelling mammal.");
    }

    @Override
    void stateBird() {
        System.out.println("Overridden: The Yellow-footed Green Pigeon is known locally as 'Haroli'.");
    }

    @Override
    void stateSport() {
        System.out.println("Overridden: Kabaddi is widely played and promoted across Maharashtra.");
    }

    @Override
    void stateFlower() {
        System.out.println("Overridden: Jarul, or Queen’s Flower, blooms in purple shades across the region.");
    }
}
