package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Clock;

public class ClockImplements1 implements Clock {
    @Override
    public void behaviour() {
        System.out.println("running clock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running clock identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running clock state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in clock");

    }
}
