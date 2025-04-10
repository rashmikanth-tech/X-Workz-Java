package com.xworkz.internal;

public class Bucket {
    private int version;
    private int height;
    private int color;

    public Bucket(int version, int height, int color) {
        this.version = version;
        this.height = height;
        this.color = color;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "height : " + height + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1051;
    }
}
