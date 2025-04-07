package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.gadget.Gadget;
import com.xworkz.extend.fiftyfold.gadget.Tablet;

public class GadgetRunner {
    public static void main(String[] args) {
        Gadget gadget = new Tablet();
        gadget.powerOn();
        gadget.powerOff();
        gadget.charge();
        gadget.connect();
        gadget.brand();

        Gadget gadget1 = new Gadget();
        gadget1.powerOn();
        gadget1.powerOff();
        gadget1.charge();
        gadget1.connect();
        gadget1.brand();


        System.out.println("-----------");

        Tablet tablet = new Tablet();
        tablet.powerOn();
        tablet.powerOff();
        tablet.charge();
        tablet.connect();
        tablet.brand();
    }
}
