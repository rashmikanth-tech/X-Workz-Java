package com.xworkz.internal;

public class Kettle {
    private int type;
    private int weight;
    private String capacity;

    public Kettle(int type, int weight, String capacity) {
        this.type = type;
        this.weight = weight;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "weight : " + weight + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1071;
    }
}
