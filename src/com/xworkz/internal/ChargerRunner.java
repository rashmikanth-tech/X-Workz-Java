package com.xworkz.internal;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger = new Charger("ModelVal", 17, 78);
        System.out.println(charger);

        Charger charger1 = new Charger("ModelVal", 17, 78);
        int ref = charger1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
