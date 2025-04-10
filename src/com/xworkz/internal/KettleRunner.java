package com.xworkz.internal;

public class KettleRunner {
    public static void main(String[] args) {
        Kettle kettle = new Kettle(71, 32, "CapacityVal");
        System.out.println(kettle);

        Kettle kettle1 = new Kettle(71, 32, "CapacityVal");
        int ref = kettle1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
