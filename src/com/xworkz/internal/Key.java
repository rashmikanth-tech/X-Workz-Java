package com.xworkz.internal;

public class Key {
    private int speed;
    private int type;
    private String power;

    public Key(int speed, int type, String power) {
        this.speed = speed;
        this.type = type;
        this.power = power;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "type : " + type + ", " + "power : " + power;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1050;
    }
}
