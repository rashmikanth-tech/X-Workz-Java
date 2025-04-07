package com.xworkz.extend;

public class Comet extends CometParent {

    @Override
    void category() {
        System.out.println("Overridden: Comets are icy celestial bodies that release gas or dust.");
    }

    @Override
    void famousComet() {
        System.out.println("Overridden: Halley's Comet is the most famous and visible every 76 years.");
    }

    @Override
    void cometTailFormation() {
        System.out.println("Overridden: A comet's tail forms when the Sun's heat causes sublimation of ices.");
    }

    @Override
    void cometOrbit() {
        System.out.println("Overridden: Comets follow elongated orbits that bring them close to the Sun and far into the solar system.");
    }

    @Override
    void cometComposition() {
        System.out.println("Overridden: Comets consist of a mixture of ice, dust, and rocky material.");
    }

    void discoveredBy() {
        System.out.println("Discovered By: Various astronomers over time; many are named after their discoverers.");
    }

    void partsOfComet() {
        System.out.println("Parts: Nucleus, Coma, Ion Tail, and Dust Tail.");
    }

    void speedOfComet() {
        System.out.println("Speed: Comets can travel up to 135,000 mph (217,000 km/h).");
    }

    void visibilityFromEarth() {
        System.out.println("Visibility: Some comets are visible to the naked eye when near the Sun.");
    }

    void significance() {
        System.out.println("Significance: Studying comets helps understand the early solar system.");
    }
}
