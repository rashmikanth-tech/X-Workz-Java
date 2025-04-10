package com.xworkz.internal;

public class ToothpasteRunner {
    public static void main(String[] args) {
        Toothpaste toothpaste = new Toothpaste("WidthVal", 74, 87);
        System.out.println(toothpaste);

        Toothpaste toothpaste1 = new Toothpaste("WidthVal", 74, 87);
        int ref = toothpaste1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
