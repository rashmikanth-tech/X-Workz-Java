package com.xworkz.extend.fiftyfold.flower;

public class Rose extends Flower {
    public Rose() {
        super();
        System.out.println("Running non-arg constructor Rose");
    }
    @Override
    public void bloom() {
        System.out.println("Rose blooms");
    }
    public void fragrance() {
        System.out.println("Rose has fragrance");
    }
    public void color() {
        System.out.println("Rose has color");
    }
    public void petals() {
        System.out.println("Rose has petals");
    }
    public void pollination() {
        System.out.println("Rose helps in pollination");
    }
}
