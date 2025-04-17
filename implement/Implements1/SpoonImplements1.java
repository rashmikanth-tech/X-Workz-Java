package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Spoon;

public class SpoonImplements1 implements Spoon {
    @Override
    public void behaviour() {
        System.out.println("running spoon behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running spoon identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running spoon state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in spoon");

    }
}
