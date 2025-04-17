package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Key;

public class KeyImplements1 implements Key {
    @Override
    public void behaviour() {
        System.out.println("running key behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running key identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running key state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in key");

    }
}
