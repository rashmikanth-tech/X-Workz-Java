package com.xworkz.internal;

public class Laptop {
    private int brand;
    private int height;
    private String size;

    public Laptop(int brand, int height, String size) {
        this.brand = brand;
        this.height = height;
        this.size = size;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "height : " + height + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1000;
    }
}
