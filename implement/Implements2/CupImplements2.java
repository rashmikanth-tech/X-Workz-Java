package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Cup;
import com.xworkz.implement.Interfaces.
Glass;

public class CupImplements2 implements Cup, Glass {
    @Override
    public void behaviour() {
        System.out.println("running cup behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running cup identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cup state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in cup glass");

    }
}
