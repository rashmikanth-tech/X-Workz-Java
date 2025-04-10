package com.xworkz.internal;

public class ScissorsRunner {
    public static void main(String[] args) {
        Scissors scissors = new Scissors("YearVal", "PowerVal", 94);
        System.out.println(scissors);

        Scissors scissors1 = new Scissors("YearVal", "PowerVal", 94);
        int ref = scissors1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
