package com.xworkz.internal;

public class Bulb {
    private String version;
    private String material;
    private String weight;

    public Bulb(String version, String material, String weight) {
        this.version = version;
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "material : " + material + ", " + "weight : " + weight;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1099;
    }
}
