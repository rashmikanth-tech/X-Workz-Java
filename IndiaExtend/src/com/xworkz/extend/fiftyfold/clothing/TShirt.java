package com.xworkz.extend.fiftyfold.clothing;

public class TShirt extends Clothing {
    public TShirt() {
        super();
        System.out.println("Running non-arg constructor TShirt");
    }
    @Override
    public void wear() {
        System.out.println("Tshirt is worn");
    }
    public void material() {
        System.out.println("Tshirt is made of different materials");
    }
    public void size() {
        System.out.println("Tshirt has different sizes");
    }
    public void brand() {
        System.out.println("Tshirt has brands");
    }
    public void design() {
        System.out.println("Tshirt has designs");
    }
}
