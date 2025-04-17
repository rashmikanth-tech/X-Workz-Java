package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Shampoo;

public class ShampooImplements1 implements Shampoo {
    @Override
    public void behaviour() {
        System.out.println("running shampoo behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running shampoo identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shampoo state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in shampo");

    }
}
