package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Window;

public class WindowImplements1 implements Window {
    @Override
    public void behaviour() {
        System.out.println("running window behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running window identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running window state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in window");

    }
}
