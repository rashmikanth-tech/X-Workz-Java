package com.xworkz.internal;

public class Blanket {
    private int version;
    private String height;
    private String size;

    public Blanket(int version, String height, String size) {
        this.version = version;
        this.height = height;
        this.size = size;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "height : " + height + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1026;
    }
}
