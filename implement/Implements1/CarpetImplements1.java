package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Carpet;

public class CarpetImplements1 implements Carpet {
    @Override
    public void behaviour() {
        System.out.println("running carpet behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running carpet identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running carpet state in implements");
    }
    public void features(){
        System.out.println("feature running in carpet");

    }
}
