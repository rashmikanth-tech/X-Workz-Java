package com.xworkz.internal;

public class Keyboard {
    private int weight;
    private String price;
    private String year;

    public Keyboard(int weight, String price, String year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "price : " + price + ", " + "year : " + year;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1033;
    }
}
