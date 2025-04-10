package com.xworkz.internal;

public class GloveRunner {
    public static void main(String[] args) {
        Glove glove = new Glove(25, "PowerVal", "VersionVal");
        System.out.println(glove);

        Glove glove1 = new Glove(25, "PowerVal", "VersionVal");
        int ref = glove1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
