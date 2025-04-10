package com.xworkz.internal;

public class Wallet {
    private String price;
    private String type;
    private int model;

    public Wallet(String price, String type, int model) {
        this.price = price;
        this.type = type;
        this.model = model;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "type : " + type + ", " + "model : " + model;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1047;
    }
}
