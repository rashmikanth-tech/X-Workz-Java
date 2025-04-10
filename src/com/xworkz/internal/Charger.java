package com.xworkz.internal;

public class Charger {
    private String model;
    private int material;
    private int type;

    public Charger(String model, int material, int type) {
        this.model = model;
        this.material = material;
        this.type = type;
    }

    @Override
    public String toString() {
        return "model : " + model + ", " + "material : " + material + ", " + "type : " + type;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1062;
    }
}
