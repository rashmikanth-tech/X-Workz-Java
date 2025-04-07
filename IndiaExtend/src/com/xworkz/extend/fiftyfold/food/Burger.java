package com.xworkz.extend.fiftyfold.food;

public class Burger extends Food {
    public Burger() {
        super();
        System.out.println("Running non-arg constructor Burger");
    }
    public void eat() {
        System.out.println("Burger can be eaten");
    }
    public void taste() {
        System.out.println("Burger has different tastes");
    }
    public void cook() {
        System.out.println("Burger is cooked");
    }
    public void healthy() {
        System.out.println("Burger food is healthy");
    }
    public void spicy() {
        System.out.println("Burger can be spicy");
    }
}
