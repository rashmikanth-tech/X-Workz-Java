package com.xworkz.internal;

public class Calculator {
    private int model;
    private int brand;
    private int version;

    public Calculator(int model, int brand, int version) {
        this.model = model;
        this.brand = brand;
        this.version = version;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "brand : " + brand + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1031;
    }
}
