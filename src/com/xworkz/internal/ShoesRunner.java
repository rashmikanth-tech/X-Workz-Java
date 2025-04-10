package com.xworkz.internal;

public class ShoesRunner {
    public static void main(String[] args) {
        Shoes shoes = new Shoes("CapacityVal", 7, 32);
        System.out.println(shoes);

        Shoes shoes1 = new Shoes("CapacityVal", 7, 32);
        int ref = shoes1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
