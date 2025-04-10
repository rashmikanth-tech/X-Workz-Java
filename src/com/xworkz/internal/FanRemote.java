package com.xworkz.internal;

public class FanRemote {
    private String power;
    private String type;
    private int weight;

    public FanRemote(String power, String type, int weight) {
        this.power = power;
        this.type = type;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "power : " + power + ", " + "type : " + type + ", " + "weight : " + weight;
    }

    @Override
    public int hashCode() {
        System.out.println("orginal Hashcode : " + super.hashCode());
        return 1061;
    }
}
