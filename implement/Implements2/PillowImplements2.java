package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Blanket;
import com.xworkz.implement.Interfaces.
Pillow;

public class PillowImplements2 implements Pillow, Blanket {
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
    @Override
    public void features(){
        System.out.println("feature running in pillow blanket");

    }
}
