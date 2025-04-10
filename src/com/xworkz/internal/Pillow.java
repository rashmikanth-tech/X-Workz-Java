package com.xworkz.internal;

public class Pillow {
    private int speed;
    private String type;
    private int height;

    public Pillow(int speed, String type, int height) {
        this.speed = speed;
        this.type = type;
        this.height = height;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "type : " + type + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1025;
    }
}
