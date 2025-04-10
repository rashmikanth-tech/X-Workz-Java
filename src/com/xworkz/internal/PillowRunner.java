package com.xworkz.internal;

public class PillowRunner {
    public static void main(String[] args) {
        Pillow pillow = new Pillow(4, "TypeVal", 47);
        System.out.println(pillow);

        Pillow pillow1 = new Pillow(4, "TypeVal", 47);
        int ref = pillow1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
