package com.xworkz.internal;

public class Piano {
    private String speed;
    private String size;
    private String price;

    public Piano(String speed, String size, String price) {
        this.speed = speed;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "speed : " + speed + ", " + "size : " + size + ", " + "price : " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1037;
    }
}
