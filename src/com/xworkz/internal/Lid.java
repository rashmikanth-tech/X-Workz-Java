package com.xworkz.internal;

public class Lid {
    private String material;
    private int type;
    private String capacity;

    public Lid(String material, int type, String capacity) {
        this.material = material;
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "type : " + type + ", " + "capacity : " + capacity;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1095;
    }
}
