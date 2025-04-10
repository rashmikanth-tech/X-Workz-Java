package com.xworkz.internal;

public class StandRunner {
    public static void main(String[] args) {
        Stand stand = new Stand(48, 28, 21);
        System.out.println(stand);

        Stand stand1 = new Stand(48, 28, 21);
        int ref = stand1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
