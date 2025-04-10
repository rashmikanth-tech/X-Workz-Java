package com.xworkz.internal;

public class BagpackRunner {
    public static void main(String[] args) {
        Bagpack bagpack = new Bagpack(22, 58, 66);
        System.out.println(bagpack);

        Bagpack bagpack1 = new Bagpack(22, 58, 66);
        int ref = bagpack1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
