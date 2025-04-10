package com.xworkz.internal;

public class Television {
    private String height;
    private int speed;
    private int model;

    public Television(String height, int speed, int model) {
        this.height = height;
        this.speed = speed;
        this.model = model;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "speed : " + speed + ", " + "model : " + model;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1011;
    }
}
