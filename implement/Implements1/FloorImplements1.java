package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Floor;

public class FloorImplements1 implements Floor {
    @Override
    public void behaviour() {
        System.out.println("running floor behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running floor identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running floor state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in floor");

    }
}
