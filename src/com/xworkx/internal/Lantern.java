package com.xworkx.internal;

public class Lantern {
    private String type;
    private String brand;
    private String color;

    public Lantern(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type : " + type + ", brand : " + brand + ", color : " + color;
    }
}
