package com.xworkz.internal;

public class SpoonRunner {
    public static void main(String[] args) {
        Spoon spoon = new Spoon("HeightVal", 14, "ColorVal");
        System.out.println(spoon);

        Spoon spoon1 = new Spoon("HeightVal", 14, "ColorVal");
        int ref = spoon1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
