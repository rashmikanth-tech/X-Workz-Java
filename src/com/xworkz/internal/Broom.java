package com.xworkz.internal;

public class Broom {
    private String version;
    private int size;
    private int price;

    public Broom(String version, int size, int price) {
        this.version = version;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "size : " + size + ", " + "price : " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1069;
    }
}
