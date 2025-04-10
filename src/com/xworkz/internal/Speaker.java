package com.xworkz.internal;

public class Speaker {
    private int material;
    private int year;
    private int power;

    public Speaker(int material, int year, int power) {
        this.material = material;
        this.year = year;
        this.power = power;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "year : " + year + ", " + "power : " + power;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1023;
    }
}
