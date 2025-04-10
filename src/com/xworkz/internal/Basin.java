package com.xworkz.internal;

public class Basin {
    private String year;
    private int weight;
    private String speed;

    public Basin(String year, int weight, String speed) {
        this.year = year;
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "weight : " + weight + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1092;
    }
}
