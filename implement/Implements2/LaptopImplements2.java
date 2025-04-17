package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Laptop;
import com.xworkz.implement.Interfaces.
Smartphone;

public class LaptopImplements2 implements Laptop, Smartphone {
    @Override
    public void behaviour() {
        System.out.println("running laptop behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running laptop identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running laptop state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in lap smartphone");

    }
}
