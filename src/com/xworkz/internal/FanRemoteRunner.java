package com.xworkz.internal;

public class FanRemoteRunner {
    public static void main(String[] args) {
        FanRemote fanRemote = new FanRemote("PowerVal", "TypeVal", 56);
        System.out.println(fanRemote);

        FanRemote fanRemote1 = new FanRemote("PowerVal", "TypeVal", 56);
        int ref = fanRemote1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
