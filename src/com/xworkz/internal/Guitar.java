package com.xworkz.internal;

public class Guitar {
    private String speed;
    private int capacity;
    private String type;

    public Guitar(String speed, int capacity, String type) {
        this.speed = speed;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "capacity : " + capacity + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1036;
    }
}
