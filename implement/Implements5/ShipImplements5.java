package com.xworkz.implement.Implements5;

import com.xworkz.implement.Interfaces.*;



public class ShipImplements5 implements Ship, Clock, Watch, Speaker, Headphone {
    @Override
    public void behaviour() {
        System.out.println("running  behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running  identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running  state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in implement5");

    }
}
