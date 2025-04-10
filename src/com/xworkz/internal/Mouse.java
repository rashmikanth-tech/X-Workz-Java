package com.xworkz.internal;

public class Mouse {
    private int model;
    private String brand;
    private String height;

    public Mouse(int model, String brand, String height) {
        this.model = model;
        this.brand = brand;
        this.height = height;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "brand : " + brand + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1032;
    }
}
