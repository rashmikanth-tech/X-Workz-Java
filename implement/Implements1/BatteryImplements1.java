package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Battery;

public class BatteryImplements1 implements Battery {
    @Override
    public void behaviour() {
        System.out.println("running battery behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running battery identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running battery state in implements");
    }
}
