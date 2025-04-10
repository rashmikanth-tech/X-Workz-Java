package com.xworkz.internal;

public class Toothpaste {
    private String width;
    private int year;
    private int speed;

    public Toothpaste(String width, int year, int speed) {
        this.width = width;
        this.year = year;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "year : " + year + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1044;
    }
}
