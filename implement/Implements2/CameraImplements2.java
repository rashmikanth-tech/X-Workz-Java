package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Bulb;
import com.xworkz.implement.Interfaces.
Camera;

public class CameraImplements2 implements Camera, Bulb {
    @Override
    public void behaviour() {
        System.out.println("running camera behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running camera identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running camera state in implements");
    }
}
