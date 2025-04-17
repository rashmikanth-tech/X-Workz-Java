package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bottle;
import com.xworkz.implement.Interfaces.
Fan;

public class BottleImplements2 implements Bottle, Fan {
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
    @Override
    public void features(){
        System.out.println("feature running in bottle fan");

    }
}
