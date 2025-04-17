package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Roof;
import com.xworkz.implement.Interfaces.
Wall;

public class WallImplements2 implements Wall, Roof {
    @Override
    public void behaviour() {
        System.out.println("running wall behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running wall identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running wall state in implements");
    }
}
