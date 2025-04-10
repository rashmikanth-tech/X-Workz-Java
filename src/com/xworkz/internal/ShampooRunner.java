package com.xworkz.internal;

public class ShampooRunner {
    public static void main(String[] args) {
        Shampoo shampoo = new Shampoo("WeightVal", "SizeVal", "ModelVal");
        System.out.println(shampoo);

        Shampoo shampoo1 = new Shampoo("WeightVal", "SizeVal", "ModelVal");
        int ref = shampoo1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
