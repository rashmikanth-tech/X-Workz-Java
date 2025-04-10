package com.xworkz.internal;

public class Mat {
    private String brand;
    private int model;
    private int type;

    public Mat(String brand, int model, int type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "model : " + model + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1091;
    }
}
