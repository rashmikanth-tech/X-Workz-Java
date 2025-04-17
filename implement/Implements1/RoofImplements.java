package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Roof;

public class RoofImplements implements Roof {
    @Override
    public void behaviour() {
        System.out.println("running roof behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running roof identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running roof state in implements");
    }
}
