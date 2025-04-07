package com.xworkz.extend.fiftyfold.gadget;

public class Tablet extends Gadget {
    public Tablet() {
        super();
        System.out.println("Running non-arg constructor Tablet");
    }
    @Override
    public void powerOn() {
        System.out.println("Tablet is powered on");
    }
    public void powerOff() {
        System.out.println("Tablet is powered off");
    }
    public void charge() {
        System.out.println("Tablet is charging");
    }
    public void connect() {
        System.out.println("Tablet connects to network");
    }
    public void brand() {
        System.out.println("Tablet has a brand");
    }
}
