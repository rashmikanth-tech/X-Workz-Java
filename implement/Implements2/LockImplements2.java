package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bag;
import com.xworkz.implement.Interfaces.
Lock;

public class LockImplements2 implements Lock, Bag {
    @Override
    public void behaviour() {
        System.out.println("running lock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bag identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lock state in implements");
    }
}
