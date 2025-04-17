package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Fan;

public class FanImplements1 implements Fan {
    @Override
    public void behaviour() {
        System.out.println("running fan behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running fan identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running fan state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in fan");

    }
}
