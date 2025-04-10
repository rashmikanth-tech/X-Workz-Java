package com.xworkz.internal;

public class Watch {
    private String year;
    private String brand;
    private int height;

    public Watch(String year, String brand, int height) {
        this.year = year;
        this.brand = brand;
        this.height = height;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "brand : " + brand + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1015;
    }
}
