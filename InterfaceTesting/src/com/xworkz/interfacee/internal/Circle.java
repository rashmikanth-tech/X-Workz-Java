package com.xworkz.interfacee.internal;

//.Shape;

public class Circle implements Shape {
    public Circle() {
        System.out.println("✅ Circle object created");
    }

    @Override
    public void action() {
        System.out.println("Circle is performing its Shape action.");
    }
}
