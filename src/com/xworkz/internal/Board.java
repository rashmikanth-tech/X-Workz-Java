package com.xworkz.internal;

public class Board {
    private int material;
    private int height;
    private int capacity;

    public Board(int material, int height, int capacity) {
        this.material = material;
        this.height = height;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "height : " + height + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1087;
    }
}
