package com.xworkz.extend;

public class Exoplanet extends ExoplanetParent {

    @Override
    void category() {
        System.out.println("Overridden: Exoplanets are planets located outside our solar system.");
    }

    @Override
    void firstDiscovered() {
        System.out.println("Overridden: The first confirmed exoplanet was 51 Pegasi b, discovered in 1995.");
    }

    @Override
    void exoplanetDetection() {
        System.out.println("Overridden: Exoplanets are detected using methods like transit and radial velocity.");
    }

    @Override
    void habitableZone() {
        System.out.println("Overridden: The habitable zone is the region where liquid water could exist.");
    }

    @Override
    void exoplanetAtmosphere() {
        System.out.println("Overridden: Exoplanet atmospheres may contain gases such as hydrogen, oxygen, and methane.");
    }

    void numberOfExoplanetsDiscovered() {
        System.out.println("Number Discovered: Over 5,000 exoplanets have been confirmed.");
    }

    void exoplanetTypes() {
        System.out.println("Types: Gas giants, Super-Earths, Terrestrial planets.");
    }

    void importanceOfStudy() {
        System.out.println("Importance: Helps in understanding planetary formation and the possibility of life.");
    }

    void telescopeUsed() {
        System.out.println("Telescopes: Kepler, TESS, James Webb Space Telescope.");
    }

    void closestExoplanet() {
        System.out.println("Closest Exoplanet: Proxima Centauri b.");
    }
}
