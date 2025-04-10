package com.xworkz.internal;

public class WatchRunner {
    public static void main(String[] args) {
        Watch watch = new Watch("YearVal", "BrandVal", 99);
        System.out.println(watch);

        Watch watch1 = new Watch("YearVal", "BrandVal", 99);
        int ref = watch1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
