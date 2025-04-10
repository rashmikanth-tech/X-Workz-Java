package com.xworkz.internal;

public class KnifeRunner {
    public static void main(String[] args) {
        Knife knife = new Knife(39, 74, 81);
        System.out.println(knife);

        Knife knife1 = new Knife(39, 74, 81);
        int ref = knife1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
