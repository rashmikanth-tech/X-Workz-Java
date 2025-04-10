package com.xworkz.internal;

public class Toy {
    private int brand;
    private String weight;
    private int color;

    public Toy(int brand, String weight, int color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "weight : " + weight + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1089;
    }
}
