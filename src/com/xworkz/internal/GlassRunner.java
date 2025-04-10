package com.xworkz.internal;

public class GlassRunner {
    public static void main(String[] args) {
        Glass glass = new Glass("PriceVal", 56, 98);
        System.out.println(glass);

        Glass glass1 = new Glass("PriceVal", 56, 98);
        int ref = glass1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
