package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Bus;

public class BusImplements1 implements Bus {
    @Override
    public void behaviour() {
        System.out.println("running bus behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bus identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bus state in implements");
    }
    public void features(){
        System.out.println("feature running in bus");

    }
}
