package com.xworkz.internal;

public class Lamp {
    private int type;
    private String width;
    private String year;

    public Lamp(int type, String width, String year) {
        this.type = type;
        this.width = width;
        this.year = year;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "width : " + width + ", " + "year : " + year;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1038;
    }
}
