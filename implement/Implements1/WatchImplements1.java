package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Watch;

public class WatchImplements1 implements Watch {
    @Override
    public void behaviour() {
        System.out.println("running watch behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running watch identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running watch state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in watch");

    }
}
