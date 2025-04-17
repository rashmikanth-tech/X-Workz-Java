package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Cap;
import com.xworkz.implement.Interfaces.
Helmet;

public class CapImplements2 implements Cap, Helmet {
    @Override
    public void behaviour() {
        System.out.println("running cap behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running cap identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cap state in implements");
    }
}
