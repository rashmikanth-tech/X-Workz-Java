package com.xworkz.internal;

public class PanRunner {
    public static void main(String[] args) {
        Pan pan = new Pan(51, 66, 9);
        System.out.println(pan);

        Pan pan1 = new Pan(51, 66, 9);
        int ref = pan1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
