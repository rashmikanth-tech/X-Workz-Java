package com.xworkz.internal;

public class Helmet {
    private int type;
    private String model;
    private String price;

    public Helmet(int type, String model, String price) {
        this.type = type;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "model : " + model + ", " + "price : " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1057;
    }
}
