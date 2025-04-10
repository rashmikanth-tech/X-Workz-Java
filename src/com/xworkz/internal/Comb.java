package com.xworkz.internal;

public class Comb {
    private String width;
    private int year;
    private int version;

    public Comb(String width, int year, int version) {
        this.width = width;
        this.year = year;
        this.version = version;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "year : " + year + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1043;
    }
}
