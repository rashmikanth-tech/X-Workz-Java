package com.xworkz.interfacee.internal;

//.Toy;

public class TeddyBear implements Toy {
    public TeddyBear() {
        System.out.println("✅ TeddyBear object created");
    }

    @Override
    public void action() {
        System.out.println("TeddyBear is performing its Toy action.");
    }
}
