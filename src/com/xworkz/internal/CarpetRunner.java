package com.xworkz.internal;

public class CarpetRunner {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(63, 65, 83);
        System.out.println(carpet);

        Carpet carpet1 = new Carpet(63, 65, 83);
        int ref = carpet1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
