package com.xworkz.interfacee.internal;

//.Animal;

public class Dog implements Animal {
    public Dog() {
        System.out.println("✅ Dog object created");
    }

    @Override
    public void action() {
        System.out.println("Dog is performing its Animal action.");
    }
}
