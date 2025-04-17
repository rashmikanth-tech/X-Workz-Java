package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Oven;

public class OvenImplements1 implements Oven {
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
    @Override
    public void features(){
        System.out.println("feature running in oven");

    }
}
