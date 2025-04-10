package com.xworkz.internal;

public class MicrowaveRunner {
    public static void main(String[] args) {
        Microwave microwave = new Microwave(53, "WidthVal", 100);
        System.out.println(microwave);

        Microwave microwave1 = new Microwave(53, "WidthVal", 100);
        int ref = microwave1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
