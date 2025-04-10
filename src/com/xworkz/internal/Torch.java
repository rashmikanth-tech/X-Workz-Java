package com.xworkz.internal;

public class Torch {
    private int version;
    private String speed;
    private int width;

    public Torch(int version, String speed, int width) {
        this.version = version;
        this.speed = speed;
        this.width = width;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "speed : " + speed + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1077;
    }
}
