package com.xworkz.internal;

public class TripodRunner {
    public static void main(String[] args) {
        Tripod tripod = new Tripod("HeightVal", "VersionVal", "CapacityVal");
        System.out.println(tripod);

        Tripod tripod1 = new Tripod("HeightVal", "VersionVal", "CapacityVal");
        int ref = tripod1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
