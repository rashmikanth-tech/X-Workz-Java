package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Fridge;

public class FridgeImplements1 implements Fridge {
    @Override
    public void behaviour() {
        System.out.println("running fridge behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running fridge identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running fridge state in implements");
    }
}
