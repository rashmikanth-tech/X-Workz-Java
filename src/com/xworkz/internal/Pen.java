package com.xworkz.internal;

public class Pen {
    private String type;
    private int size;
    private int height;

    public Pen(String type, int size, int height) {
        this.type = type;
        this.size = size;
        this.height = height;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "size : " + size + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1006;
    }
}
