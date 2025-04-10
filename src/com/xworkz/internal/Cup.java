package com.xworkz.internal;

public class Cup {
    private String width;
    private int power;
    private String speed;

    public Cup(String width, int power, String speed) {
        this.width = width;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "power : " + power + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1021;
    }
}
