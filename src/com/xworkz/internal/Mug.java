package com.xworkz.internal;

public class Mug {
    private int speed;
    private int type;
    private int brand;

    public Mug(int speed, int type, int brand) {
        this.speed = speed;
        this.type = type;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "type : " + type + ", " + "brand : " + brand;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1052;
    }
}
