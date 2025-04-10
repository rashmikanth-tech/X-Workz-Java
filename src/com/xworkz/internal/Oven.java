package com.xworkz.internal;

public class Oven {
    private int height;
    private int size;
    private int type;

    public Oven(int height, int size, int type) {
        this.height = height;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "size : " + size + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1072;
    }
}
