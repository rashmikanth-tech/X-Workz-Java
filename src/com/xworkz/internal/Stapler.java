package com.xworkz.internal;

public class Stapler {
    private String height;
    private String price;
    private String material;

    public Stapler(String height, String price, String material) {
        this.height = height;
        this.price = price;
        this.material = material;
    }

    @Override
    public String toString() {
        return "height : " + height + ", " + "price : " + price + ", " + "material : " + material;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1030;
    }
}
