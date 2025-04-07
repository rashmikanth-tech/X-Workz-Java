package com.xworkz.extend.fiftyfold.charger;

public class Wire extends Charger{
    public Wire(){
        System.out.println("running non-arg const Wire");
    }
    @Override
    public void plug(){
        System.out.println("plug wire Charger");
    }
    public void white(){
        System.out.println("white wire Charger");
    }
    public void small(){
        System.out.println("small wire Charger");
    }
    public void cPin(){
        System.out.println("cPin wire Charger");
    }
    public void phone(){
        System.out.println("phone wire Charger");
    }
}
