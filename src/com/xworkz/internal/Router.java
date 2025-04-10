package com.xworkz.internal;

public class Router {
    private int width;
    private int size;
    private int model;

    public Router(int width, int size, int model) {
        this.width = width;
        this.size = size;
        this.model = model;
    }

    @Override
    public String toString() {
        return "width : " + width + ", " + "size : " + size + ", " + "model : " + model;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1028;
    }
}
