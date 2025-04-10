package com.xworkz.internal;

public class BlanketRunner {
    public static void main(String[] args) {
        Blanket blanket = new Blanket(24, "HeightVal", "SizeVal");
        System.out.println(blanket);

        Blanket blanket1 = new Blanket(24, "HeightVal", "SizeVal");
        int ref = blanket1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
