package com.xworkz.extend.fiftyfold.ocean;

public class Pacific extends Ocean {
    public Pacific() {
        super();
        System.out.println("Running non-arg constructor Pacific");
    }
    @Override
    public void depth() {
        System.out.println("Pecific has great depth");
    }
    public void marineLife() {
        System.out.println("Pecific supports diverse marine life");
    }
    public void waves() {
        System.out.println("Pecific has strong waves");
    }
    public void temperature() {
        System.out.println("Pecific water temperature varies");
    }
    public void tides() {
        System.out.println("Pecific experiences tides");
    }
}
