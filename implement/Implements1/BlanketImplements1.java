package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Blanket;

public class BlanketImplements1 implements Blanket {
    @Override
    public void behaviour() {
        System.out.println("running blanket behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running blanket identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running blanket state in implements");
    }
    public void features(){
        System.out.println("feature running in blank");

    }
}
