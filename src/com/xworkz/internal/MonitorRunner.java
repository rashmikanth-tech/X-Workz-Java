package com.xworkz.internal;

public class MonitorRunner {
    public static void main(String[] args) {
        Monitor monitor = new Monitor(92, 47, 44);
        System.out.println(monitor);

        Monitor monitor1 = new Monitor(92, 47, 44);
        int ref = monitor1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
