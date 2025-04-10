package com.xworkz.internal;

public class BottleRunner {
    public static void main(String[] args) {
        Bottle bottle = new Bottle("VersionVal", 26, 92);
        System.out.println(bottle);

        Bottle bottle1 = new Bottle("VersionVal", 26, 92);
        int ref = bottle1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
