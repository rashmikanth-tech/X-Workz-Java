package com.xworkz.internal;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella(87, "WeightVal", 70);
        System.out.println(umbrella);

        Umbrella umbrella1 = new Umbrella(87, "WeightVal", 70);
        int ref = umbrella1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
