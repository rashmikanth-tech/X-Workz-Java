package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Door;
import com.xworkz.implement.Interfaces.
Window;

public class DoorImplements2 implements Door, Window {
    @Override
    public void behaviour() {
        System.out.println("running door behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running door identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running door state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in door window");

    }
}
