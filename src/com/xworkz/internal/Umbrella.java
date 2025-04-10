package com.xworkz.internal;

public class Umbrella {
    private int model;
    private String weight;
    private int width;

    public Umbrella(int model, String weight, int width) {
        this.model = model;
        this.weight = weight;
        this.width = width;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "weight : " + weight + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1083;
    }
}
