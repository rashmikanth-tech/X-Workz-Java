package com.xworkz.extend.fiftyfold.fruit;

public class Apple extends Fruit {
    public Apple() {
        super();
        System.out.println("Running non-arg constructor of Apple");
    }
    @Override
    public void taste() {
        System.out.println("Apple has a taste");
    }
    public void color() {
        System.out.println("Apple has a color");
    }
    public void nutrients() {
        System.out.println("Apple contains nutrients");
    }
    public void seasonal() {
        System.out.println("Apple fruits are seasonal");
    }

}
