package com.xworkz.internal;

public class Map {
    private int color;
    private String size;
    private String material;

    public Map(int color, String size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "color : " + color + ", " + "size : " + size + ", " + "material : " + material;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1079;
    }
}
