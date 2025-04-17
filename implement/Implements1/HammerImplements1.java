package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Hammer;

public class HammerImplements1 implements Hammer {
    @Override
    public void behaviour() {
        System.out.println("running hammer behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running hammer identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running hammer state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in hammer");

    }
}
