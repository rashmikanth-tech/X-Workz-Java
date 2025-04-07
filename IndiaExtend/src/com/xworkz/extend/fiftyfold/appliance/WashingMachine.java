package com.xworkz.extend.fiftyfold.appliance;

public class WashingMachine extends Appliance {
    public WashingMachine() {
        super();
        System.out.println("Running non-arg constructor WashingMachine");
    }
    @Override
    public void powerOn() {
        System.out.println("Washingmachine is powered on");
    }
    public void powerOff() {
        System.out.println("Washingmachine is powered off");
    }
    public void consumeElectricity() {
        System.out.println("Washingmachine consumes electricity");
    }
    public void function() {
        System.out.println("Washingmachine performs a function");
    }
    public void brand() {
        System.out.println("Washingmachine has a brand");
    }
}
