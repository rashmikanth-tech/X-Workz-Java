package com.xworkz.internal;

public class Bicycle {
    private String capacity;
    private String price;
    private int color;

    public Bicycle(String capacity, String price, int color) {
        this.capacity = capacity;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "capacity : " + capacity + ", " + "price : " + price + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1010;
    }
}
