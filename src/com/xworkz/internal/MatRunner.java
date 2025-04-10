package com.xworkz.internal;

public class MatRunner {
    public static void main(String[] args) {
        Mat mat = new Mat("BrandVal", 98, 71);
        System.out.println(mat);

        Mat mat1 = new Mat("BrandVal", 98, 71);
        int ref = mat1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
