package com.xworkz.internal;

public class Microwave {
    private int material;
    private String width;
    private int speed;

    public Microwave(int material, String width, int speed) {
        this.material = material;
        this.width = width;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "width : " + width + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1018;
    }
}
