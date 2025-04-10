package com.xworkz.internal;

public class Tape {
    private String width;
    private int version;
    private int speed;

    public Tape(String width, int version, int speed) {
        this.width = width;
        this.version = version;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "version : " + version + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1076;
    }
}
