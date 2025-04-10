package com.xworkz.internal;

public class LockRunner {
    public static void main(String[] args) {
        Lock lock = new Lock(85, "PowerVal", 62);
        System.out.println(lock);

        Lock lock1 = new Lock(85, "PowerVal", 62);
        int ref = lock1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
