package com.xworkz.internal;

public class ClockRunner {
    public static void main(String[] args) {
        Clock clock = new Clock("PriceVal", "BrandVal", "TypeVal");
        System.out.println(clock);

        Clock clock1 = new Clock("PriceVal", "BrandVal", "TypeVal");
        int ref = clock1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
