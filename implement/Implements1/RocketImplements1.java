package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Rocket;

public class RocketImplements1 implements Rocket {
    @Override
    public void behaviour() {
        System.out.println("running rocket behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running rocket identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running rocket state in implements");
    }
}
