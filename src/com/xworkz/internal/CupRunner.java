package com.xworkz.internal;

public class CupRunner {
    public static void main(String[] args) {
        Cup cup = new Cup("WidthVal", 70, "SpeedVal");
        System.out.println(cup);

        Cup cup1 = new Cup("WidthVal", 70, "SpeedVal");
        int ref = cup1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
