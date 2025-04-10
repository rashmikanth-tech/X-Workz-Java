package com.xworkz.internal;

public class Brush {
    private String brand;
    private int height;
    private String width;

    public Brush(String brand, int height, String width) {
        this.brand = brand;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "height : " + height + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1042;
    }
}
