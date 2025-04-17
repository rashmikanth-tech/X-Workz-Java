package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Drone;

public class DroneImplements1 implements Drone {
    @Override
    public void behaviour() {
        System.out.println("running drone behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running drone identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running drone state in implements");
    }
}
