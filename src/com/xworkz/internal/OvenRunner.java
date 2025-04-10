package com.xworkz.internal;

public class OvenRunner {
    public static void main(String[] args) {
        Oven oven = new Oven(100, 47, 20);
        System.out.println(oven);

        Oven oven1 = new Oven(100, 47, 20);
        int ref = oven1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
