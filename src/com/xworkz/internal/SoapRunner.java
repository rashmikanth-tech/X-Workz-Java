package com.xworkz.internal;

public class SoapRunner {
    public static void main(String[] args) {
        Soap soap = new Soap("YearVal", 85, 100);
        System.out.println(soap);

        Soap soap1 = new Soap("YearVal", 85, 100);
        int ref = soap1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
