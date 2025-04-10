package com.xworkz.internal;

public class Dustbin {
    private String price;
    private int speed;
    private int version;

    public Dustbin(String price, int speed, int version) {
        this.price = price;
        this.speed = speed;
        this.version = version;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "speed : " + speed + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1097;
    }
}
