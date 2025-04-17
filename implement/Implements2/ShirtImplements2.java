package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Pant;
import com.xworkz.implement.Interfaces.
Shirt;

public class ShirtImplements2 implements Shirt, Pant {
    @Override
    public void behaviour() {
        System.out.println("running shirt behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running shirt identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shirt state in implements");
    }
}
