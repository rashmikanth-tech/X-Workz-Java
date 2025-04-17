package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Laptop;

public class LaptopImplements1 implements Laptop {
    @Override
    public void behaviour() {
        System.out.println("running laptop behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running laptop identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running laptop state in implements");
    }
}
