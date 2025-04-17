package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Airplane;
import com.xworkz.implement.Interfaces.
Ship;

public class AirplaneImplements2 implements Airplane, Ship {
    @Override
    public void behaviour() {
        System.out.println("running Airplane behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running airplane identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running airplane state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in plane ship");

    }
}
