package com.xworkz.internal;

public class BedRunner {
    public static void main(String[] args) {
        Bed bed = new Bed(76, 50, 94);
        System.out.println(bed);

        Bed bed1 = new Bed(76, 50, 94);
        int ref = bed1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
