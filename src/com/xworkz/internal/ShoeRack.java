package com.xworkz.internal;

public class ShoeRack {
    private String version;
    private int color;
    private String power;

    public ShoeRack(String version, int color, String power) {
        this.version = version;
        this.color = color;
        this.power = power;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "color : " + color + ", " + "power : " + power;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1085;
    }
}
