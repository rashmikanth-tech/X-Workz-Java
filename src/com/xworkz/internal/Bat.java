package com.xworkz.internal;

public class Bat {
    private String version;
    private String power;
    private String size;

    public Bat(String version, String power, String size) {
        this.version = version;
        this.power = power;
        this.size = size;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "power : " + power + ", " + "size : " + size;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1056;
    }
}
