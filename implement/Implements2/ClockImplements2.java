package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Clock;
import com.xworkz.implement.Interfaces.
Watch;

public class ClockImplements2 implements Clock, Watch {
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
}
