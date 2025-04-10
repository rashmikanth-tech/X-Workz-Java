package com.xworkz.internal;

public class Drone {
    private String version;
    private int model;
    private String width;

    public Drone(String version, int model, String width) {
        this.version = version;
        this.model = model;
        this.width = width;
    }

    @Override
    public String toString() {
        return "version : " + version + ", " + "model : " + model + ", " + "width : " + width;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1065;
    }
}
