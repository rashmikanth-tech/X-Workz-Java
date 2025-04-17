package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Lamp;

public class LampImplements1 implements Lamp {
    @Override
    public void behaviour() {
        System.out.println("running lamp behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running lamp identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lamp state in implements");
    }
}
