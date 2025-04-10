package com.xworkz.internal;

public class Soap {
    private String year;
    private int brand;
    private int material;

    public Soap(String year, int brand, int material) {
        this.year = year;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "brand : " + brand + ", " + "material : " + material;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1046;
    }
}
