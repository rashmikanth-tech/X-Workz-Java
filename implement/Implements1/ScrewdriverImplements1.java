package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Screwdriver;

public class ScrewdriverImplements1 implements Screwdriver {
    @Override
    public void behaviour() {
        System.out.println("running screwdriver behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running screwdriver identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running screwdriver state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in screw");

    }
}
