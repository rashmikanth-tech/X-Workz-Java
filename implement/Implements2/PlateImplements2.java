package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Plate;
import com.xworkz.implement.Interfaces.
Spoon;

public class PlateImplements2 implements Plate, Spoon {
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
}
