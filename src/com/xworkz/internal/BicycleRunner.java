package com.xworkz.internal;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("CapacityVal", "PriceVal", 51);
        System.out.println(bicycle);

        Bicycle bicycle1 = new Bicycle("CapacityVal", "PriceVal", 51);
        int ref = bicycle1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
