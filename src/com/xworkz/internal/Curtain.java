package com.xworkz.internal;

public class Curtain {
    private int size;
    private int capacity;
    private String weight;

    public Curtain(int size, int capacity, String weight) {
        this.size = size;
        this.capacity = capacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "capacity : " + capacity + ", " + "weight : " + weight;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1039;
    }
}
