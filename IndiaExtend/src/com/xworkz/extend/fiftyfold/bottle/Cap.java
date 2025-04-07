package com.xworkz.extend.fiftyfold.bottle;

public class Cap extends Bottle{
    public Cap(){
        super();
        System.out.println("running non-arg const cap");
    }
    @Override
    public void fill(){
        System.out.println("fill bottle put cap");
    }
    public void water(){
        System.out.println("water bottle has a cap");
    }
    public void milk(){
        System.out.println("milk bottle has a cap");
    }
    public void glass(){
        System.out.println("glass bottle has a cap");
    }
    public void frozen(){
        System.out.println("frozen bottle has a cap");
    }
}
