package com.xworkz.internal;

public class TapRunner {
    public static void main(String[] args) {
        Tap tap = new Tap("PowerVal", "CapacityVal", 39);
        System.out.println(tap);

        Tap tap1 = new Tap("PowerVal", "CapacityVal", 39);
        int ref = tap1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
