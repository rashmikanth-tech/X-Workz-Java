package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Toothpaste;

public class ToothpasteImplements1 implements Toothpaste {
    @Override
    public void behaviour() {
        System.out.println("running tooth paste behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running tooth paste identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tooth paste state in implements");
    }
}
