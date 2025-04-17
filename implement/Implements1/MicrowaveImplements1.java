package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Microwave;

public class MicrowaveImplements1 implements Microwave {
    @Override
    public void behaviour() {
        System.out.println("running microwave behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running microwave identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running microwave state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in microwave");

    }
}
