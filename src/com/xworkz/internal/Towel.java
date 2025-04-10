package com.xworkz.internal;

public class Towel {
    private String color;
    private int weight;
    private String width;

    public Towel(String color, int weight, String width) {
        this.color = color;
        this.weight = weight;
        this.width = width;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "weight : " + weight + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1041;
    }
}
