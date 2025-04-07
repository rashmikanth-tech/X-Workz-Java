package com.xworkz.extend.fiftyfold.drink;

public class Juice extends Drink {
    public Juice() {
        super();
        System.out.println("Running non-arg constructor Juice");
    }
    public void sip() {
        System.out.println("Juice is sipped");
    }
    public void refresh() {
        System.out.println("Juice is refreshing");
    }
    public void cold() {
        System.out.println("Juice can be cold");
    }
    public void sweet() {
        System.out.println("Juice can be sweet");
    }
    public void healthy() {
        System.out.println("Juice can be healthy");
    }
}
