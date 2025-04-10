package com.xworkz.internal;

public class Drum {
    private String brand;
    private int type;
    private String weight;

    public Drum(String brand, int type, String weight) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "brand : " + brand + ", " + "type : " + type + ", " + "weight : " + weight;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1035;
    }
}
