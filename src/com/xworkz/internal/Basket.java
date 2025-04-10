package com.xworkz.internal;

public class Basket {
    private String year;
    private int width;
    private String capacity;

    public Basket(String year, int width, String capacity) {
        this.year = year;
        this.width = width;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "width : " + width + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1086;
    }
}
