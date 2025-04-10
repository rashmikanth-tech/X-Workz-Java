package com.xworkz.internal;

public class Card {
    private int size;
    private int material;
    private int color;

    public Card(int size, int material, int color) {
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public String toString() {
        return "size : " + size + ", " + "material : " + material + ", " + "color : " + color;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1048;
    }
}
