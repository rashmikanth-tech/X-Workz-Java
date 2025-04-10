package com.xworkz.internal;

public class Stand {
    private int power;
    private int year;
    private int type;

    public Stand(int power, int year, int type) {
        this.power = power;
        this.year = year;
        this.type = type;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "year : " + year + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1096;
    }
}
