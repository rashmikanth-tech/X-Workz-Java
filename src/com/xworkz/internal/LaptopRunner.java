package com.xworkz.internal;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(80, 66, "SizeVal");
        System.out.println(laptop);

        Laptop laptop1 = new Laptop(80, 66, "SizeVal");
        int ref = laptop1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
