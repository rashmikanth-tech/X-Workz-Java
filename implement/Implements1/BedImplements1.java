package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Bed;

public class BedImplements1 implements Bed {
    @Override
    public void behaviour() {
        System.out.println("running bed behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bed identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bed state in implements");
    }
}
