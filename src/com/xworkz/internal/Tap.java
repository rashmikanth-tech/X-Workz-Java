package com.xworkz.internal;

public class Tap {
    private String power;
    private String capacity;
    private int width;

    public Tap(String power, String capacity, int width) {
        this.power = power;
        this.capacity = capacity;
        this.width = width;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "capacity : " + capacity + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1093;
    }
}
