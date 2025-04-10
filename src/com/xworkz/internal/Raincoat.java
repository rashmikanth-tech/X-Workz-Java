package com.xworkz.internal;

public class Raincoat {
    private int capacity;
    private int year;
    private String speed;

    public Raincoat(int capacity, int year, String speed) {
        this.capacity = capacity;
        this.year = year;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "capacity : " + capacity + ", " + "year : " + year + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1084;
    }
}
