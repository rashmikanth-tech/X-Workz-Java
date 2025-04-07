package com.xworkz.extend.fiftyfold.festival;

public class Diwali extends Festival {
    public Diwali() {
        super();
        System.out.println("Running non-arg constructor of Diwali");
    }
    @Override
    public void celebrate() {
        System.out.println("Depavali are celebrated joyfully");
    }
    public void traditions() {
        System.out.println("Depavali follow different traditions");
    }
    public void holidays() {
        System.out.println("Depavali often bring holidays");
    }
    public void food() {
        System.out.println("Depavali have special food items");
    }
}
