package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Towel;

public class TowelImplements1 implements Towel {
    @Override
    public void behaviour() {
        System.out.println("running towel behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running towel identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running towel state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in towel");

    }
}
