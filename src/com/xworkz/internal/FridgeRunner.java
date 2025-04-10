package com.xworkz.internal;

public class FridgeRunner {
    public static void main(String[] args) {
        Fridge fridge = new Fridge(11, "PowerVal", 46);
        System.out.println(fridge);

        Fridge fridge1 = new Fridge(11, "PowerVal", 46);
        int ref = fridge1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
