package com.xworkz.internal;

public class KeyRunner {
    public static void main(String[] args) {
        Key key = new Key(97, 76, "PowerVal");
        System.out.println(key);

        Key key1 = new Key(97, 76, "PowerVal");
        int ref = key1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
