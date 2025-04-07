package com.xworkz.extend;

public class Island extends IslandParent {

    @Override
    void category() {
        System.out.println("Overridden: An island is a landmass surrounded by water.");
    }

    @Override
    void largestIsland() {
        System.out.println("Overridden: Greenland is the world’s largest island by area.");
    }

    @Override
    void mostPopulatedIsland() {
        System.out.println("Overridden: Java in Indonesia is the most populated island on Earth.");
    }

    @Override
    void islandClimate() {
        System.out.println("Overridden: Islands experience tropical to temperate climates depending on their location.");
    }

    @Override
    void famousIsland() {
        System.out.println("Overridden: The Maldives is a world-famous island nation known for luxury tourism.");
    }
}
