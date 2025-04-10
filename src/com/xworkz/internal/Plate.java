package com.xworkz.internal;

public class Plate {
    private int price;
    private int material;
    private String height;

    public Plate(int price, int material, String height) {
        this.price = price;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "price : " + price + ", " + "material : " + material + ", " + "height : " + height;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1040;
    }
}
