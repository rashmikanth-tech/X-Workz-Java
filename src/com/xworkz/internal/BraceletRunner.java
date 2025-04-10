package com.xworkz.internal;

public class BraceletRunner {
    public static void main(String[] args) {
        Bracelet bracelet = new Bracelet(28, 98, "SizeVal");
        System.out.println(bracelet);

        Bracelet bracelet1 = new Bracelet(28, 98, "SizeVal");
        int ref = bracelet1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
