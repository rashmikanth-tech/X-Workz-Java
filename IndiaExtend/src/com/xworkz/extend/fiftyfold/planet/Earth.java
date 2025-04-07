package com.xworkz.extend.fiftyfold.planet;

public class Earth extends Planet {
    public Earth() {
        super();
        System.out.println("Running non-arg constructor Earth");
    }
    @Override
    public void orbitsSun() {
        System.out.println("Earth orbits the sun");
    }
    public void hasGravity() {
        System.out.println("Earth has gravity");
    }
    public void hasAtmosphere() {
        System.out.println("Earth has an atmosphere");
    }
    public void supportsLife() {
        System.out.println("Earth planets support life");
    }
    public void hasOceans() {
        System.out.println("Earth planets have oceans");
    }
}
