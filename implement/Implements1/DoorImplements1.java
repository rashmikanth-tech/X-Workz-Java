package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Door;

public class DoorImplements1 implements Door {
    @Override
    public void behaviour() {
        System.out.println("running door behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running door identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running door state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in door");

    }
}
