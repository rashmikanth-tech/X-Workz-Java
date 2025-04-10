package com.xworkz.internal;

public class StaplerRunner {
    public static void main(String[] args) {
        Stapler stapler = new Stapler("HeightVal", "PriceVal", "MaterialVal");
        System.out.println(stapler);

        Stapler stapler1 = new Stapler("HeightVal", "PriceVal", "MaterialVal");
        int ref = stapler1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
