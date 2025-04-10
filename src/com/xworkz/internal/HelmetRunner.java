package com.xworkz.internal;

public class HelmetRunner {
    public static void main(String[] args) {
        Helmet helmet = new Helmet(95, "ModelVal", "PriceVal");
        System.out.println(helmet);

        Helmet helmet1 = new Helmet(95, "ModelVal", "PriceVal");
        int ref = helmet1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
