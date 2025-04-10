package com.xworkz.internal;

public class TowelRunner {
    public static void main(String[] args) {
        Towel towel = new Towel("ColorVal", 45, "WidthVal");
        System.out.println(towel);

        Towel towel1 = new Towel("ColorVal", 45, "WidthVal");
        int ref = towel1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
