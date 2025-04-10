package com.xworkz.internal;

public class SofaRunner {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("YearVal", "BrandVal", 10);
        System.out.println(sofa);

        Sofa sofa1 = new Sofa("YearVal", "BrandVal", 10);
        int ref = sofa1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
