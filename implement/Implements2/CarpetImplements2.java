package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Carpet;
import com.xworkz.implement.Interfaces.
Mirror;

public class CarpetImplements2 implements Carpet, Mirror {
    @Override
    public void behaviour() {
        System.out.println("running carpet behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running carpet identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running carpet state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in carpet mirror");

    }
}
