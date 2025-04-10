package com.xworkz.internal;

public class CurtainRunner {
    public static void main(String[] args) {
        Curtain curtain = new Curtain(20, 98, "WeightVal");
        System.out.println(curtain);

        Curtain curtain1 = new Curtain(20, 98, "WeightVal");
        int ref = curtain1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
