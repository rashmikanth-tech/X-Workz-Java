package com.xworkz.internal;

public class Glass {
    private String price;
    private int height;
    private int model;

    public Glass(String price, int height, int model) {
        this.price = price;
        this.height = height;
        this.model = model;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "height : " + height + ", " + "model : " + model;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1053;
    }
}
