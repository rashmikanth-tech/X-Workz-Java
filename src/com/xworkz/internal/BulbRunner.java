package com.xworkz.internal;

public class BulbRunner {
    public static void main(String[] args) {
        Bulb bulb = new Bulb("VersionVal", "MaterialVal", "WeightVal");
        System.out.println(bulb);

        Bulb bulb1 = new Bulb("VersionVal", "MaterialVal", "WeightVal");
        int ref = bulb1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
