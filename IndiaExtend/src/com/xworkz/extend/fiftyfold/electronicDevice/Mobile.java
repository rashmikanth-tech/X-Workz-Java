package com.xworkz.extend.fiftyfold.electronicDevice;

public class Mobile extends ElectronicDevice{

        public Mobile() {
            super();
            System.out.println("Running non-arg constructor of Mobile");
        }
    @Override
    public void powerOn() {
        System.out.println("Mobile device is powered on");
    }
    public void powerOff() {
        System.out.println("Mobile device is powered off");
    }
    public void battery() {
        System.out.println("Mobile device has a battery");
    }
    public void charge() {
        System.out.println("EMobile device is charging");
    }
    }


