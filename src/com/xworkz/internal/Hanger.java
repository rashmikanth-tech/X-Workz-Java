package com.xworkz.internal;

public class Hanger {
    private String version;
    private String power;
    private int capacity;

    public Hanger(String version, String power, int capacity) {
        this.version = version;
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "power : " + power + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1094;
    }
}
