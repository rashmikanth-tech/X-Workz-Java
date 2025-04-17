package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Helmet;

public class HelmetImplements1 implements Helmet {
    @Override
    public void behaviour() {
        System.out.println("running helmet behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running helmet identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running helmet state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in helmet");

    }
}
