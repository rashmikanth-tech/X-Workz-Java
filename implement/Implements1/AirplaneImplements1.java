package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Airplane;
import com.xworkz.implement.Interfaces.Airplane;


public class AirplaneImplements1 implements Airplane {
    @Override
    public void behaviour() {
        System.out.println("running airplane behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running airplane identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running airplane state in implements");
    }
}
