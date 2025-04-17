package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Glass;

public class GlassImplements1 implements Glass {
    @Override
    public void behaviour() {
        System.out.println("running glass behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running glass identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running glass state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in glass");

    }
}
