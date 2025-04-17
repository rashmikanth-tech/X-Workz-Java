package com.xworkz.implement.Implements5;

import com.xworkz.implement.Interfaces.*;
Watch;


public class ClockImplements5 implements Clock, Watch, Speaker, Headphone, Camera {
    @Override
    public void behaviour() {
        System.out.println("running  behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running  identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running  state in implements");
    }
}
