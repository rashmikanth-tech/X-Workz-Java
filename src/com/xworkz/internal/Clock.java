package com.xworkz.internal;

public class Clock {
    private String price;
    private String brand;
    private String type;

    public Clock(String price, String brand, String type) {
        this.price = price;
        this.brand = brand;
        this.type = type;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "brand : " + brand + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1014;
    }
}
