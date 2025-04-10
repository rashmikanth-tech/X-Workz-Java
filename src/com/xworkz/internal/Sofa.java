package com.xworkz.internal;

public class Sofa {
    private String year;
    private String brand;
    private int capacity;

    public Sofa(String year, String brand, int capacity) {
        this.year = year;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "brand : " + brand + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1017;
    }
}
