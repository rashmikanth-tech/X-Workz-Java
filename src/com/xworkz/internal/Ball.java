package com.xworkz.internal;

public class Ball {
    private int brand;
    private int height;
    private int size;

    public Ball(int brand, int height, int size) {
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
        return 1055;
    }
}
