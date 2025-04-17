package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Plate;

public class PlateImplements1 implements Plate {
    @Override
    public void behaviour() {
        System.out.println("running plate behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running plate identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running plate state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in plate");

    }
}
