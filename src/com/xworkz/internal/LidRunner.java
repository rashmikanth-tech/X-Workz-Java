package com.xworkz.internal;

public class LidRunner {
    public static void main(String[] args) {
        Lid lid = new Lid("MaterialVal", 8, "CapacityVal");
        System.out.println(lid);

        Lid lid1 = new Lid("MaterialVal", 8, "CapacityVal");
        int ref = lid1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
