package com.xworkz.internal;

public class Bed {
    private int weight;
    private int year;
    private int type;

    public Bed(int weight, int year, int type) {
        this.weight = weight;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "weight : " + weight + ", " + "year : " + year + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1016;
    }
}
