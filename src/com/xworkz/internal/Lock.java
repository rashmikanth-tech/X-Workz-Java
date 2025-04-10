package com.xworkz.internal;

public class Lock {
    private int price;
    private String power;
    private int speed;

    public Lock(int price, String power, int speed) {
        this.price = price;
        this.power = power;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "power : " + power + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1049;
    }
}
