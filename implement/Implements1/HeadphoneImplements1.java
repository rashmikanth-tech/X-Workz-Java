package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Headphone;

public class HeadphoneImplements1 implements Headphone {
    @Override
    public void behaviour() {
        System.out.println("running headphone behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running headphone identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running headphone state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in headphone");

    }
}
