package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Fridge;
import com.xworkz.implement.Interfaces.
Television;

public class TelevisionImplements2 implements Television, Fridge {
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
}
