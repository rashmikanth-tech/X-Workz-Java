package com.xworkx.internal;

public class Ruler {
    private String type;
    private String brand;
    private String color;

    public Ruler(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type : " + type + ", brand : " + brand + ", color : " + color;
    }
}
