package com.xworkz.internal;

public class Monitor {
    private int speed;
    private int version;
    private int year;

    public Monitor(int speed, int version, int year) {
        this.speed = speed;
        this.version = version;
        this.year = year;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "version : " + version + ", " + "year : " + year;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1034;
    }
}
