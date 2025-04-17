package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
WasshingMachine;

public class WashingMachineImplements1 implements WasshingMachine {
    @Override
    public void behaviour() {
        System.out.println("running washing machine behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running washing machine identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running washing machine state in implements");
    }
}
