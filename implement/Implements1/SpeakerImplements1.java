package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Speaker;

public class SpeakerImplements1 implements Speaker {
    @Override
    public void behaviour() {
        System.out.println("running speaker behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running speaker identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running speaker state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in speak");

    }
}
