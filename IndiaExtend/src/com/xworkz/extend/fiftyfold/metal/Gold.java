package com.xworkz.extend.fiftyfold.metal;

public class Gold extends Metal {
    public Gold() {
        super();
        System.out.println("Running non-arg constructor Gold");
    }
    @Override
    public void conductivity() {
        System.out.println("Gold is not a good conductor of electricity");
    }
    public void durability() {
        System.out.println("Gold  is durable");
    }
    public void malleability() {
        System.out.println("Gold  can be shaped into different forms");
    }
    public void density() {
        System.out.println("Gold l has a certain density");
    }
    public void corrosion() {
        System.out.println("Gold  metals not corrode over time");
    }
}
