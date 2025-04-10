package com.xworkz.internal;

public class Phone {
    private String power;
    private int weight;
    private int year;

    public Phone(String power, int weight, int year) {
        this.power = power;
        this.weight = weight;
        this.year = year;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "weight : " + weight + ", " + "year : " + year;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1002;
    }
}
