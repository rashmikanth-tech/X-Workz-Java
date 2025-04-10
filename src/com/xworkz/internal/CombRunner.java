package com.xworkz.internal;

public class CombRunner {
    public static void main(String[] args) {
        Comb comb = new Comb("WidthVal", 7, 76);
        System.out.println(comb);

        Comb comb1 = new Comb("WidthVal", 7, 76);
        int ref = comb1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
