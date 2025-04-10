package com.xworkz.internal;

public class Book {
    private String height;
    private int size;
    private String brand;

    public Book(String height, int size, String brand) {
        this.height = height;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "size : " + size + ", " + "brand : " + brand;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1003;
    }
}
