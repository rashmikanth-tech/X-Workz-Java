package com.xworkz.internal;

public class Bag {
    private int price;
    private String material;
    private String size;

    public Bag(int price, String material, String size) {
        this.price = price;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "material : " + material + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1007;
    }
}
