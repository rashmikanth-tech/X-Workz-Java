package com.xworkz.internal;

public class RemoteRunner {
    public static void main(String[] args) {
        Remote remote = new Remote(45, "PowerVal", 14);
        System.out.println(remote);

        Remote remote1 = new Remote(45, "PowerVal", 14);
        int ref = remote1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
