package com.xworkz.internal;

public class MirrorRunner {
    public static void main(String[] args) {
        Mirror mirror = new Mirror("SpeedVal", 32, 4);
        System.out.println(mirror);

        Mirror mirror1 = new Mirror("SpeedVal", 32, 4);
        int ref = mirror1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
