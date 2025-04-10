package com.xworkz.internal;

public class Mic {
    private String power;
    private String type;
    private String color;

    public Mic(String power, String type, String color) {
        this.power = power;
        this.type = type;
        this.color = color;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "type : " + type + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1067;
    }
}
