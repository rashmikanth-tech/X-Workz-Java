package com.xworkz.extend;

public class Asteroid extends AsteroidParent {

    @Override
    void category() {
        System.out.println("Overridden: Asteroids are rocky bodies that orbit the Sun, mostly in the asteroid belt.");
    }

    @Override
    void largestAsteroid() {
        System.out.println("Overridden: The largest asteroid is Ceres, which is also classified as a dwarf planet.");
    }

    @Override
    void asteroidBelt() {
        System.out.println("Overridden: Most asteroids are located in the asteroid belt between Mars and Jupiter.");
    }

    @Override
    void asteroidComposition() {
        System.out.println("Overridden: Asteroids are made up of metals like nickel and iron, rocks, and sometimes ice.");
    }

    @Override
    void asteroidImpact() {
        System.out.println("Overridden: A large asteroid impact can lead to mass extinction events on Earth.");
    }

    void discoveryYear() {
        System.out.println("Discovery Year: The first asteroid, Ceres, was discovered in 1801.");
    }

    void numberOfKnownAsteroids() {
        System.out.println("Known Asteroids: Over 1.3 million identified in our solar system.");
    }

    void missionsToAsteroids() {
        System.out.println("Missions: NASA's OSIRIS-REx and JAXA's Hayabusa2 have explored asteroids.");
    }

    void asteroidUses() {
        System.out.println("Uses: Potential for mining rare metals like platinum in the future.");
    }

    void interestingFact() {
        System.out.println("Interesting Fact: Some asteroids have their own moons!");
    }
}
