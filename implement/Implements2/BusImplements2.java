package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bus;
import com.xworkz.implement.Interfaces.
Train;

public class BusImplements2 implements Bus, Train {
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
    @Override
    public void features(){
        System.out.println("feature running in bus train");

    }
}
