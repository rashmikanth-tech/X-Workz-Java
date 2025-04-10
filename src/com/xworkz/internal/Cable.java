package com.xworkz.internal;

public class Cable {
    private int power;
    private int brand;
    private int speed;

    public Cable(int power, int brand, int speed) {
        this.power = power;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "brand : " + brand + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1063;
    }
}
