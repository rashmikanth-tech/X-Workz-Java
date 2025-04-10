package com.xworkz.internal;

public class Chair {
    private int brand;
    private String model;
    private String size;

    public Chair(int brand, String model, String size) {
        this.brand = brand;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "model : " + model + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1004;
    }
}
