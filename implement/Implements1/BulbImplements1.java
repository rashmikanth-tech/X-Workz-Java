package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Bulb;

public class BulbImplements1 implements Bulb {
    @Override
    public void behaviour() {
        System.out.println("running bulb behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bulb identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bulb state in implements");
    }
    public void features(){
        System.out.println("feature running in bulb");

    }
}
