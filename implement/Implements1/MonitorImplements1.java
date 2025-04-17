package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Monitor;

public class MonitorImplements1 implements Monitor {
    @Override
    public void behaviour() {
        System.out.println("running monitor behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running monitor identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running monitor state in implements");
    }
}
