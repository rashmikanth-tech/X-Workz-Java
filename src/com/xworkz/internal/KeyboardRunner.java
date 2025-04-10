package com.xworkz.internal;

public class KeyboardRunner {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard(94, "PriceVal", "YearVal");
        System.out.println(keyboard);

        Keyboard keyboard1 = new Keyboard(94, "PriceVal", "YearVal");
        int ref = keyboard1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
