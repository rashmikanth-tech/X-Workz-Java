package com.xworkz.internal;

public class BucketRunner {
    public static void main(String[] args) {
        Bucket bucket = new Bucket(26, 96, 49);
        System.out.println(bucket);

        Bucket bucket1 = new Bucket(26, 96, 49);
        int ref = bucket1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
