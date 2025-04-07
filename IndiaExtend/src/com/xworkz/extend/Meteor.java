package com.xworkz.extend;

public class Meteor extends MeteorParent {

    @Override
    void category() {
        System.out.println("Overridden: A meteor is a bright streak of light from a space rock burning in Earth's atmosphere.");
    }

    @Override
    void meteorShowers() {
        System.out.println("Overridden: Famous meteor showers include the Perseids in August and the Leonids in November.");
    }

    @Override
    void meteorSpeed() {
        System.out.println("Overridden: Meteors can travel at speeds reaching up to 72 kilometers per second.");
    }

    @Override
    void meteorComposition() {
        System.out.println("Overridden: Meteors often contain metals like nickel and iron, along with rocky silicates.");
    }

    @Override
    void meteorImpact() {
        System.out.println("Overridden: When large meteors hit Earth, they can form impact craters and cause local damage.");
    }
}
