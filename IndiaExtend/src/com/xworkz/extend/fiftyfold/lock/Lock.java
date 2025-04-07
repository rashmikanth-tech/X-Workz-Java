package com.xworkz.extend.fiftyfold.lock;

public class Lock extends Key{
    public Lock(){
        System.out.println("running non-arg const Lock");
    }
    @Override
    public void open(){
        System.out.println("open Lock");
    }
    public void white(){
        System.out.println("whiteLock");
    }
    public void small(){
        System.out.println("small Lock");
    }
    public void close(){
        System.out.println("close Key");
    }
    public void big(){
        System.out.println("big Lock");
    }
}
