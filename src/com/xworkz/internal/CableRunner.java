package com.xworkz.internal;

public class CableRunner {
    public static void main(String[] args) {
        Cable cable = new Cable(73, 31, 13);
        System.out.println(cable);

        Cable cable1 = new Cable(73, 31, 13);
        int ref = cable1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
