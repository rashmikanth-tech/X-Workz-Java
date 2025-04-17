package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Headphone;
import com.xworkz.implement.Interfaces.
Speaker;

public class SpeakerImplements2 implements Speaker, Headphone {
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
}
