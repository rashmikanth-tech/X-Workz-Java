package com.xworkz.extend;

public class Nebula extends NebulaParent {

    @Override
    void category() {
        System.out.println("Overridden: A nebula is a massive cloud of dust and gas in space, often forming stars.");
    }

    @Override
    void famousNebula() {
        System.out.println("Overridden: The Orion Nebula is one of the brightest and closest regions of star formation.");
    }

    @Override
    void nebulaTypes() {
        System.out.println("Overridden: Main types include Emission Nebulae (glow red), Reflection Nebulae (glow blue), Dark Nebulae (block light), and Planetary Nebulae (expelled outer layers of dying stars).");
    }

    @Override
    void nebulaFormation() {
        System.out.println("Overridden: Nebulae form from the remnants of supernova explosions or by gravitational collapse of gas clouds.");
    }

    @Override
    void nebulaImportance() {
        System.out.println("Overridden: Nebulae are crucial for understanding stellar birth and the evolution of galaxies.");
    }
}
