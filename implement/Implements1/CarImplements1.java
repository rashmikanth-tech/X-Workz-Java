package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Car;

public class CarImplements1 implements Car {
    @Override
    public void behaviour() {
        System.out.println("running car behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running car identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running car state in implements");
    }
}
