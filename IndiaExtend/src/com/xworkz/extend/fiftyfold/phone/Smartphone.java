package com.xworkz.extend.fiftyfold.phone;

public class Smartphone extends Phone {
    public Smartphone() {
        super();
        System.out.println("Running non-arg constructor Smartphone");
    }
    @Override
    public void call() {
        System.out.println("SmartPhone can make calls");
    }
    public void message() {
        System.out.println("SmartPhone can send messages");
    }
    public void camera() {
        System.out.println("SmartPhone has a camera");
    }
    public void battery() {
        System.out.println("SmartPhone has a battery");
    }
    public void internet() {
        System.out.println("SmartPhone can browse the internet");
    }

}
