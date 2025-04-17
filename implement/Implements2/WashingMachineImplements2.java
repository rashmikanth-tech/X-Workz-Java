package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Oven;
import com.xworkz.implement.Interfaces.
WasshingMachine;

public class WashingMachineImplements2 implements WasshingMachine, Oven {
    @Override
    public void behaviour() {
        System.out.println("running oven behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running oven identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running oven state in implements");
    }
}
