package com.xworkz.internal;

public class FanRunner {
    public static void main(String[] args) {
        Fan fan = new Fan("CapacityVal", 62, 98);
        System.out.println(fan);

        Fan fan1 = new Fan("CapacityVal", 62, 98);
        int ref = fan1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
