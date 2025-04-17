package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Soap;

public class SoapImplements1 implements Soap {
    @Override
    public void behaviour() {
        System.out.println("running soap behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running soap identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running soap state in implements");
    }
}
