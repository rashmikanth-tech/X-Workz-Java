package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Sofa;

public class SofaImplements1 implements Sofa {
    @Override
    public void behaviour() {
        System.out.println("running sofa behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running sofa identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running sofa state in implements");
    }
}
