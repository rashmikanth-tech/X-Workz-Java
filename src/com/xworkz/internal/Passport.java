package com.xworkz.internal;

public class Passport {
    private int version;
    private int speed;
    private String power;

    public Passport(int version, int speed, String power) {
        this.version = version;
        this.speed = speed;
        this.power = power;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "speed : " + speed + ", " + "power : " + power;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1080;
    }
}
