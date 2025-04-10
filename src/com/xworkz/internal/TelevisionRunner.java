package com.xworkz.internal;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television television = new Television("HeightVal", 81, 11);
        System.out.println(television);

        Television television1 = new Television("HeightVal", 81, 11);
        int ref = television1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
