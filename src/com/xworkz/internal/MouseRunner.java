package com.xworkz.internal;

public class MouseRunner {
    public static void main(String[] args) {
        Mouse mouse = new Mouse(60, "BrandVal", "HeightVal");
        System.out.println(mouse);

        Mouse mouse1 = new Mouse(60, "BrandVal", "HeightVal");
        int ref = mouse1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
