package com.xworkz.internal;

public class NecklaceRunner {
    public static void main(String[] args) {
        Necklace necklace = new Necklace(28, "BrandVal", 79);
        System.out.println(necklace);

        Necklace necklace1 = new Necklace(28, "BrandVal", 79);
        int ref = necklace1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
