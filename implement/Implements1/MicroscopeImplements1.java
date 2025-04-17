package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Microscope;

public class MicroscopeImplements1 implements Microscope {
    @Override
    public void behaviour() {
        System.out.println("running microscope behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running microscope identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running microscope state in implements");
    }
}
