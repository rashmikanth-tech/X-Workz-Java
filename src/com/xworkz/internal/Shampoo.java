package com.xworkz.internal;

public class Shampoo {
    private String weight;
    private String size;
    private String model;

    public Shampoo(String weight, String size, String model) {
        this.weight = weight;
        this.size = size;
        this.model = model;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "size : " + size + ", " + "model : " + model;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1045;
    }
}
