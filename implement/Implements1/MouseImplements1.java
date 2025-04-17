package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Mouse;

public class MouseImplements1 implements Mouse {
    @Override
    public void behaviour() {
        System.out.println("running mouse behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running mouse identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running mouse state in implements");
    }
}
