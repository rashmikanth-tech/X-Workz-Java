package com.xworkz.extend.fiftyfold.caboard;

public class Door extends Caboard{
    public Door(){
        System.out.println("running non-arg const Door");
    }
    @Override
    public void lock(){
        System.out.println("Door Caboard");
    }
    public void key(){
        System.out.println("Door Caboard");
    }
    public void handle(){
        System.out.println("handle Door");
    }
    public void open(){
        System.out.println("open Door");
    }
    public void close(){
        System.out.println("close Door");
    }
}
