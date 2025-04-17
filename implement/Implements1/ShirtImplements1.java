package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Shirt;

public class ShirtImplements1 implements Shirt {
    @Override
    public void behaviour() {
        System.out.println("running shirt behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running shirt identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shirt state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in shirt");

    }
}
