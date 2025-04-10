package com.xworkz.internal;

public class Knife {
    private int year;
    private int version;
    private int color;

    public Knife(int year, int version, int color) {
        this.year = year;
        this.version = version;
        this.color = color;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "version : " + version + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1074;
    }
}
