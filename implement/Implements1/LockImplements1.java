package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Lock;

public class LockImplements1 implements Lock {
    @Override
    public void behaviour() {
        System.out.println("running lock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running lock identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lock state in implements");
    }
}
