package com.xworkz.internal;

public class BroomRunner {
    public static void main(String[] args) {
        Broom broom = new Broom("VersionVal", 60, 39);
        System.out.println(broom);

        Broom broom1 = new Broom("VersionVal", 60, 39);
        int ref = broom1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
