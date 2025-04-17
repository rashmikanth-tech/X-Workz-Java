package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Shoe;

public class ShoeImplements1 implements Shoe {
    @Override
    public void behaviour() {
        System.out.println("running shoe behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running shoe identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shoe state in implements");
    }
}
