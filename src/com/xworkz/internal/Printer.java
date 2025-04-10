package com.xworkz.internal;

public class Printer {
    private int color;
    private String size;
    private int version;

    public Printer(int color, String size, int version) {
        this.color = color;
        this.size = size;
        this.version = version;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "size : " + size + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1029;
    }
}
