package com.xworkz.internal;

public class HangerRunner {
    public static void main(String[] args) {
        Hanger hanger = new Hanger("VersionVal", "PowerVal", 5);
        System.out.println(hanger);

        Hanger hanger1 = new Hanger("VersionVal", "PowerVal", 5);
        int ref = hanger1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
