package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Chair;

public class ChairImplements1 implements Chair {
    @Override
    public void behaviour() {
        System.out.println("running chair behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running chair identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running chair state in implements");
    }
    public void features(){
        System.out.println("feature running in chair");

    }
}
