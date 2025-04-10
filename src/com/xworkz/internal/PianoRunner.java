package com.xworkz.internal;

public class PianoRunner {
    public static void main(String[] args) {
        Piano piano = new Piano("SpeedVal", "SizeVal", "PriceVal");
        System.out.println(piano);

        Piano piano1 = new Piano("SpeedVal", "SizeVal", "PriceVal");
        int ref = piano1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
