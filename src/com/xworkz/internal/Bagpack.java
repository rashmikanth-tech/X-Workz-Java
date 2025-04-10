package com.xworkz.internal;

public class Bagpack {
    private int height;
    private int type;
    private int price;

    public Bagpack(int height, int type, int price) {
        this.height = height;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "type : " + type + ", " + "price : " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1078;
    }
}
