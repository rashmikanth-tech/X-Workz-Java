package com.xworkz.internal;

public class DroneRunner {
    public static void main(String[] args) {
        Drone drone = new Drone("VersionVal", 49, "WidthVal");
        System.out.println(drone);

        Drone drone1 = new Drone("VersionVal", 49, "WidthVal");
        int ref = drone1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
