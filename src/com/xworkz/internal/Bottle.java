package com.xworkz.internal;

public class Bottle {
    private String version;
    private int price;
    private int height;

    public Bottle(String version, int price, int height) {
        this.version = version;
        this.price = price;
        this.height = height;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "price : " + price + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1008;
    }
}
