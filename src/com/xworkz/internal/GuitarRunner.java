package com.xworkz.internal;

public class GuitarRunner {
    public static void main(String[] args) {
        Guitar guitar = new Guitar("SpeedVal", 25, "TypeVal");
        System.out.println(guitar);

        Guitar guitar1 = new Guitar("SpeedVal", 25, "TypeVal");
        int ref = guitar1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
