package com.xworkz.internal;

public class Fridge {
    private int model;
    private String power;
    private int speed;

    public Fridge(int model, String power, int speed) {
        this.model = model;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "power : " + power + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1012;
    }
}
