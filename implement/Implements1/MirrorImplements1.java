package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Mirror;

public class MirrorImplements1 implements Mirror {
    @Override
    public void behaviour() {
        System.out.println("running mirror behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running mirror identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running mirror state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in micro implement");

    }
}
