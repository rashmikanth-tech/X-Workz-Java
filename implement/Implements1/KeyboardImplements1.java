package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Keyboard;

public class KeyboardImplements1 implements Keyboard {
    @Override
    public void behaviour() {
        System.out.println("running keyboard behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running keyboard identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running keyboard state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in keybord");

    }
}
