package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.charger.Charger;
import com.xworkz.extend.fiftyfold.charger.Wire;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger=new Wire();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();

        System.out.println("---------");
        Wire wire=new Wire();
        wire.cPin();
        wire.plug();
        wire.phone();
        wire.small();
        wire.white();

        Charger charger1= new Wire();
        charger1.cPin();
        charger1.phone();
        charger1.plug();
        charger1.small();
        charger.white();


    }

}
