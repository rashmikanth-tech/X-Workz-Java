package com.xworkz.internal;

public class Projector {
    private int height;
    private int power;
    private int size;

    public Projector(int height, int power, int size) {
        this.height = height;
        this.power = power;
        this.size = size;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "power : " + power + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1066;
    }
}
