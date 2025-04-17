package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Pillow;

public class PillowImplements1 implements Pillow {
    @Override
    public void behaviour() {
        System.out.println("running pillow behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pillow identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pillow state in implements");
    }
}
