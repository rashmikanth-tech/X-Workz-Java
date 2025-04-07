package com.xworkz.extend.fiftyfold.plant;

public class Flower extends Plant {
    public Flower() {
        super();
        System.out.println("Running non-arg constructor Flower");
    }
    @Override
    public void grow() {
        System.out.println("Flower grows");
    }
    public void photosynthesis() {
        System.out.println("Flower performs photosynthesis");
    }
    public void absorbWater() {
        System.out.println("Flower absorbs water");
    }
    public void provideOxygen() {
        System.out.println("Flower provides oxygen");
    }
    public void reproduce() {
        System.out.println("Flower reproduces");
    }
}
