package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Camera;

public class CameraImplements1 implements Camera {
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
