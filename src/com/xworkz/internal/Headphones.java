package com.xworkz.internal;

public class Headphones {
    private String year;
    private int version;
    private int color;

    public Headphones(String year, int version, int color) {
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
        return 1024;
    }
}
