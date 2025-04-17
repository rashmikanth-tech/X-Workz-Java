package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Curtain;

public class CurtainImplements1 implements Curtain {
    @Override
    public void behaviour() {
        System.out.println("running curtain behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running curtain identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running curtain state in implements");
    }
}
