package com.xworkz.internal;

public class PenRunner {
    public static void main(String[] args) {
        Pen pen = new Pen("TypeVal", 18, 1);
        System.out.println(pen);

        Pen pen1 = new Pen("TypeVal", 18, 1);
        int ref = pen1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
