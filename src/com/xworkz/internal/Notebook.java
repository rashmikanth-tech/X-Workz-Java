package com.xworkz.internal;

public class Notebook {
    private String material;
    private int width;
    private String version;

    public Notebook(String material, int width, String version) {
        this.material = material;
        this.width = width;
        this.version = version;
    }

    @Override
    public String toString() {
        return "material : " + material + ", " + "width : " + width + ", " + "version : " + version;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1027;
    }
}
