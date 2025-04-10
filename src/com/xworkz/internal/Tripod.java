package com.xworkz.internal;

public class Tripod {
    private String height;
    private String version;
    private String capacity;

    public Tripod(String height, String version, String capacity) {
        this.height = height;
        this.version = version;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "version : " + version + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1068;
    }
}
