package com.xworkx.internal;

public class Brush {
    private String type;
    private String brand;
    private String color;

    public Brush(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type : " + type + ", brand : " + brand + ", color : " + color;
    }
}
