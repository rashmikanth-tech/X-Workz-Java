package com.xworkz.extend.fiftyfold.animal;

public class Dog extends Animal {
    public Dog() {
        super();
        System.out.println("Running non-arg constructor Dog");
    }
    @Override
    public void eat(){System.out.println("Dog eat a Rice");}
    @Override
    public void sound(){System.out.println("Dog Sound Like Bow Bow");}
    @Override
    public void run(){System.out.println("Dog run With Four lag");}
    @Override
    public void sleep(){System.out.println("Dog Sleep Like Other Animal");}
    @Override
    public void breathe(){System.out.println("DOg Breath Oxigen");}


}
