package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Ship;

public class ShipImplements1 implements Ship {
    @Override
    public void behaviour() {
        System.out.println("running ship behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running ship identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running ship state in implements");
    }
}
