package com.xworkz.internal;

public class MugRunner {
    public static void main(String[] args) {
        Mug mug = new Mug(50, 92, 57);
        System.out.println(mug);

        Mug mug1 = new Mug(50, 92, 57);
        int ref = mug1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
