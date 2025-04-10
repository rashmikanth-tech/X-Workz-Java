package com.xworkz.internal;

public class MicRunner {
    public static void main(String[] args) {
        Mic mic = new Mic("PowerVal", "TypeVal", "ColorVal");
        System.out.println(mic);

        Mic mic1 = new Mic("PowerVal", "TypeVal", "ColorVal");
        int ref = mic1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
