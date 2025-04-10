package com.xworkz.internal;

public class BatRunner {
    public static void main(String[] args) {
        Bat bat = new Bat("VersionVal", "PowerVal", "SizeVal");
        System.out.println(bat);

        Bat bat1 = new Bat("VersionVal", "PowerVal", "SizeVal");
        int ref = bat1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
