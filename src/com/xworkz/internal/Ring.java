package com.xworkz.internal;

public class Ring {
    private String width;
    private String brand;
    private int speed;

    public Ring(String width, String brand, int speed) {
        this.width = width;
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "brand : " + brand + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1058;
    }
}
