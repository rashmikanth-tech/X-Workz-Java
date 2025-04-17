package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Telescope;

public class TelescopeImplements1 implements Telescope {
    @Override
    public void behaviour() {
        System.out.println("running telescope behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running telescope identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running telescope state in implements");
    }
}
