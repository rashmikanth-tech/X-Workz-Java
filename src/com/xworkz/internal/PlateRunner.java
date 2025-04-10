package com.xworkz.internal;

public class PlateRunner {
    public static void main(String[] args) {
        Plate plate = new Plate(6, 65, "HeightVal");
        System.out.println(plate);

        Plate plate1 = new Plate(6, 65, "HeightVal");
        int ref = plate1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
