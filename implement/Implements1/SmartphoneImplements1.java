package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Smartphone;

public class SmartphoneImplements1 implements Smartphone {
    @Override
    public void behaviour() {
        System.out.println("running smartphone behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running smartphone identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running smartphone state in implements");
    }
}
