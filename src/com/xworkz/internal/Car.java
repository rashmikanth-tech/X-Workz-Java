package com.xworkz.internal;

public class Car {
    private String capacity;
    private String type;
    private int width;

    public Car(String capacity, String type, int width) {
        this.capacity = capacity;
        this.type = type;
        this.width = width;
    }

    @Override
    public String toString() {
        return "capacity : " + capacity + ", " + "type : " + type + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1001;
    }
}
