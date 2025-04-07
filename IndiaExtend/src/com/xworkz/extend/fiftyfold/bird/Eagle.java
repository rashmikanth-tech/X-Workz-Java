package com.xworkz.extend.fiftyfold.bird;

public class Eagle extends Bird {
    public Eagle() {
        super();
        System.out.println("Running non-arg constructor Eagle");
    }
    @Override
    public void fly() {
        System.out.println("Eagle can fly");
    }
    public void feathers() {
        System.out.println("Eaglehas feathers");
    }
    public void laysEggs() {
        System.out.println("Eaglelays eggs");
    }
    public void sound() {
        System.out.println("Eagle makes sounds");
    }
    public void vision() {
        System.out.println("Eagle has sharp vision");
    }

}
