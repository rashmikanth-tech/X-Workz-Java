package com.xworkz.internal;

public class Mirror {
    private String speed;
    private int year;
    private int size;

    public Mirror(String speed, int year, int size) {
        this.speed = speed;
        this.year = year;
        this.size = size;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "year : " + year + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1022;
    }
}
