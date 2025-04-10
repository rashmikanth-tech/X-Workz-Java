package com.xworkz.internal;

public class DrumRunner {
    public static void main(String[] args) {
        Drum drum = new Drum("BrandVal", 25, "WeightVal");
        System.out.println(drum);

        Drum drum1 = new Drum("BrandVal", 25, "WeightVal");
        int ref = drum1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
