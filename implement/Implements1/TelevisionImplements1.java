package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Television;

public class TelevisionImplements1 implements Television {
    @Override
    public void behaviour() {
        System.out.println("running tv behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running tv identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tv state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in telivision");

    }
}
