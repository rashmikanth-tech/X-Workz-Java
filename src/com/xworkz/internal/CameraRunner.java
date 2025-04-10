package com.xworkz.internal;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("PriceVal", "VersionVal", 59);
        System.out.println(camera);

        Camera camera1 = new Camera("PriceVal", "VersionVal", 59);
        int ref = camera1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
