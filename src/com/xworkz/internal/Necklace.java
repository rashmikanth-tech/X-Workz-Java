package com.xworkz.internal;

public class Necklace {
    private int price;
    private String brand;
    private int version;

    public Necklace(int price, String brand, int version) {
        this.price = price;
        this.brand = brand;
        this.version = version;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "brand : " + brand + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1060;
    }
}
