package com.xworkz.internal;

public class Joystick {
    private String version;
    private int price;
    private String height;

    public Joystick(String version, int price, String height) {
        this.version = version;
        this.price = price;
        this.height = height;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "price : " + price + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1064;
    }
}
