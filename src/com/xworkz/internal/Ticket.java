package com.xworkz.internal;

public class Ticket {
    private String year;
    private String size;
    private String material;

    public Ticket(String year, String size, String material) {
        this.year = year;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "year : " + year + ", " + "size : " + size + ", " + "material : " + material;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1081;
    }
}
