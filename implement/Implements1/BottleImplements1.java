package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Bottle;

public class BottleImplements1 implements Bottle {
    @Override
    public void behaviour() {
        System.out.println("running bottle behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bottle identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bottle state in implements");
    }
    public void features(){
        System.out.println("feature running in bottle");

    }
}
