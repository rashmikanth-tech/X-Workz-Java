package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Pant;

public class PantImplements1 implements Pant {
    @Override
    public void behaviour() {
        System.out.println("running pant behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pant identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pant state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in pant");

    }
}
