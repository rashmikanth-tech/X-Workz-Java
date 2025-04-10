package com.xworkz.internal;

public class Pan {
    private int type;
    private int power;
    private int capacity;

    public Pan(int type, int power, int capacity) {
        this.type = type;
        this.power = power;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "type : " + type + ", " + "power : " + power + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1070;
    }
}
