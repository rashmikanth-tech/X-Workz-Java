package com.xworkz.internal;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy = new Toy(23, "WeightVal", 79);
        System.out.println(toy);

        Toy toy1 = new Toy(23, "WeightVal", 79);
        int ref = toy1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
