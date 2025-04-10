package com.xworkz.internal;

public class BasinRunner {
    public static void main(String[] args) {
        Basin basin = new Basin("YearVal", 21, "SpeedVal");
        System.out.println(basin);

        Basin basin1 = new Basin("YearVal", 21, "SpeedVal");
        int ref = basin1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
