package com.xworkz.internal;

public class BagRunner {
    public static void main(String[] args) {
        Bag bag = new Bag(39, "MaterialVal", "SizeVal");
        System.out.println(bag);

        Bag bag1 = new Bag(39, "MaterialVal", "SizeVal");
        int ref = bag1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
