package com.xworkz.internal;

public class RingRunner {
    public static void main(String[] args) {
        Ring ring = new Ring("WidthVal", "BrandVal", 90);
        System.out.println(ring);

        Ring ring1 = new Ring("WidthVal", "BrandVal", 90);
        int ref = ring1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
