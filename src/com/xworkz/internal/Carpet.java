package com.xworkz.internal;

public class Carpet {
    private int width;
    private int material;
    private int capacity;

    public Carpet(int width, int material, int capacity) {
        this.width = width;
        this.material = material;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "material : " + material + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1090;
    }
}
