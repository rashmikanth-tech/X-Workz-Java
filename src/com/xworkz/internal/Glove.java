package com.xworkz.internal;

public class Glove {
    private int model;
    private String power;
    private String version;

    public Glove(int model, String power, String version) {
        this.model = model;
        this.power = power;
        this.version = version;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "power : " + power + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1054;
    }
}
