package com.xworkz.internal;

public class Shoes {
    private String capacity;
    private int material;
    private int speed;

    public Shoes(String capacity, int material, int speed) {
        this.capacity = capacity;
        this.material = material;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "capacity : " + capacity + ", " + "material : " + material + ", " + "speed : " + speed;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1009;
    }
}
