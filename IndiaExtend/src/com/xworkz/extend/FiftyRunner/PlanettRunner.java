package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.planet.Earth;
import com.xworkz.extend.fiftyfold.planet.Planet;

public class PlanettRunner {
    public static void main(String[] args) {
        Planet planet = new Earth();
        planet.orbitsSun();
        planet.hasGravity();
        planet.hasAtmosphere();
        planet.supportsLife();
        planet.hasOceans();

        Planet planet1 = new Planet();
        planet1.orbitsSun();
        planet1.hasGravity();
        planet1.hasAtmosphere();
        planet1.supportsLife();
        planet1.hasOceans();

        System.out.println("-----------");

        Earth earth = new Earth();
        earth.orbitsSun();
        earth.hasGravity();
        earth.hasAtmosphere();
        earth.supportsLife();
        earth.hasOceans();
    }
}
