package com.xworkz.internal;

public class BrushRunner {
    public static void main(String[] args) {
        Brush brush = new Brush("BrandVal", 12, "WidthVal");
        System.out.println(brush);

        Brush brush1 = new Brush("BrandVal", 12, "WidthVal");
        int ref = brush1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
