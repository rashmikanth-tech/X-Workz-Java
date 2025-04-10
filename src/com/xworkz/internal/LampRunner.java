package com.xworkz.internal;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Lamp(4, "WidthVal", "YearVal");
        System.out.println(lamp);

        Lamp lamp1 = new Lamp(4, "WidthVal", "YearVal");
        int ref = lamp1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
