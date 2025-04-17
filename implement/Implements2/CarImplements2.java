package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bike;
import com.xworkz.implement.Interfaces.
Car;

public class CarImplements2 implements Car, Bike {
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
