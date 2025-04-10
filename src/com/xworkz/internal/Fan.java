package com.xworkz.internal;

public class Fan {
    private String capacity;
    private int version;
    private int height;

    public Fan(String capacity, int version, int height) {
        this.capacity = capacity;
        this.version = version;
        this.height = height;
    }

    @Override
    public String toString() {
        return "capacity : " + capacity + ", " + "version : " + version + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1013;
    }
}
