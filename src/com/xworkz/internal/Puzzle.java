package com.xworkz.internal;

public class Puzzle {
    private int power;
    private int year;
    private int color;

    public Puzzle(int power, int year, int color) {
        this.power = power;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "year : " + year + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1088;
    }
}
