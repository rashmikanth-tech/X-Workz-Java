package com.xworkz.internal;

public class Camera {
    private String price;
    private String version;
    private int speed;

    public Camera(String price, String version, int speed) {
        this.price = price;
        this.version = version;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "version : " + version + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1019;
    }
}
