package com.xworkz.internal;

public class Scissors {
    private String year;
    private String power;
    private int height;

    public Scissors(String year, String power, int height) {
        this.year = year;
        this.power = power;
        this.height = height;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "power : " + power + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1075;
    }
}
