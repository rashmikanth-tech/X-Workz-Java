package com.xworkx.internal;

public class Fork {
    private String type;
    private String brand;
    private String color;

    public Fork(String type, String brand, String color) {
        this.type = type;
        this.brand = brand;
        this.color = color;
    }

    @Override
    public String toString() {
        return "type : " + type + ", brand : " + brand + ", color : " + color;
    }
}
