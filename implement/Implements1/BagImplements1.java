package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Bag;
import com.xworkz.implement.Interfaces.Bag;

public class BagImplements1 implements Bag {
    @Override
    public void behaviour() {
        System.out.println("running bag behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bag identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bag state in implements");
    }
}
