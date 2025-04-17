package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Shoe;
import com.xworkz.implement.Interfaces.
Socks;

public class ShoeImplements2 implements Shoe, Socks {
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
