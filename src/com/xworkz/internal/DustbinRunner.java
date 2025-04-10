package com.xworkz.internal;

public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin = new Dustbin("PriceVal", 39, 77);
        System.out.println(dustbin);

        Dustbin dustbin1 = new Dustbin("PriceVal", 39, 77);
        int ref = dustbin1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
