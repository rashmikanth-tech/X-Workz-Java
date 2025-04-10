package com.xworkz.internal;

public class Spoon {
    private String height;
    private int model;
    private String color;

    public Spoon(String height, int model, String color) {
        this.height = height;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "model : " + model + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1073;
    }
}
