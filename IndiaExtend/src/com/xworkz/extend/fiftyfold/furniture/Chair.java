package com.xworkz.extend.fiftyfold.furniture;

public class Chair extends Furniture {
    public Chair() {
        super();
        System.out.println("Running non-arg constructor Chair");
    }
    public void support() {
        System.out.println("Chair provides support");
    }
    public void material() {
        System.out.println("Chair is made of different materials");
    }
    public void weight() {
        System.out.println("Chair has different weights");
    }
    public void move() {
        System.out.println("Chair can be moved");
    }
    public void design() {
        System.out.println("Chair has different designs");
    }
}
