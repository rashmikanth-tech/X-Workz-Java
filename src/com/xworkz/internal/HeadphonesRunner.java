package com.xworkz.internal;

public class HeadphonesRunner {
    public static void main(String[] args) {
        Headphones headphones = new Headphones("YearVal", 31, 28);
        System.out.println(headphones);

        Headphones headphones1 = new Headphones("YearVal", 31, 28);
        int ref = headphones1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
