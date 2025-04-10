package com.xworkz.internal;

public class Bracelet {
    private int version;
    private int material;
    private String size;

    public Bracelet(int version, int material, String size) {
        this.version = version;
        this.material = material;
        this.size = size;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "material : " + material + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1059;
    }
}
