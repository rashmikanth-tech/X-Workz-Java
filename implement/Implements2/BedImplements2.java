package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bed;
import com.xworkz.implement.Interfaces.
Sofa;

public class BedImplements2 implements Bed, Sofa {
    @Override
    public void behaviour() {
        System.out.println("running bed behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bed identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bed state in implements");
    }
}
