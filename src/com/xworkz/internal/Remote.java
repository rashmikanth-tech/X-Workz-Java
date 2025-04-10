package com.xworkz.internal;

public class Remote {
    private int material;
    private String power;
    private int speed;

    public Remote(int material, String power, int speed) {
        this.material = material;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "power : " + power + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1098;
    }
}
