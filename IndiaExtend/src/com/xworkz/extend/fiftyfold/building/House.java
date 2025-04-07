package com.xworkz.extend.fiftyfold.building;

public class House extends Building{
    public House(){
        super();
        System.out.println("running non-arg cont House");
    }
    @Override
    public void shelter() {
        System.out.println("Building provides House");
    }
    public void structure() {
        System.out.println("House has a structure");
    }
    public void floors() {
        System.out.println("House has floors");
    }
    public void foundation() {
        System.out.println("House has a foundation");
    }
}
