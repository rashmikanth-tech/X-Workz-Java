package com.xworkz.internal;

public class Table {
    private String height;
    private String size;
    private String price;

    public Table(String height, String size, String price) {
        this.height = height;
        this.size = size;
        this.price = price;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "size : " + size + ", " + "price : " + price;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1005;
    }
}
