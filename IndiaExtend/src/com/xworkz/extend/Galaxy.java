package com.xworkz.extend;

public class Galaxy extends GalaxyParent {

    @Override
    void category() {
        System.out.println("Overridden: A galaxy is a massive collection of stars, planets, gas, and dark matter bound together by gravity.");
    }

    @Override
    void largestGalaxy() {
        System.out.println("Overridden: IC 1101 is the largest known galaxy, over 6 million light-years across.");
    }

    @Override
    void galaxyTypes() {
        System.out.println("Overridden: Main galaxy types are Spiral, Elliptical, Lenticular, and Irregular.");
    }

    @Override
    void galaxyFormation() {
        System.out.println("Overridden: Galaxies form from giant clouds of gas and dust collapsing under gravity over billions of years.");
    }

    @Override
    void galaxyImportance() {
        System.out.println("Overridden: Galaxies are important for hosting stars, solar systems, and potentially life.");
    }

    // Optional additional methods
    void milkyWayInfo() {
        System.out.println("Milky Way: The galaxy that contains our Solar System.");
    }

    void numberOfGalaxies() {
        System.out.println("There are an estimated 2 trillion galaxies in the observable universe.");
    }

    void nearestGalaxy() {
        System.out.println("Nearest Galaxy: Andromeda Galaxy, approximately 2.5 million light-years away.");
    }
}
