package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.appliance.Appliance;
import com.xworkz.extend.fiftyfold.appliance.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {
        Appliance appliance1 = new Appliance();
        appliance1.powerOn();
        appliance1.powerOff();
        appliance1.consumeElectricity();
        appliance1.function();
        appliance1.brand();

        System.out.println("-----------");


        Appliance appliance = new WashingMachine();
        appliance.powerOn();
        appliance.powerOff();
        appliance.consumeElectricity();
        appliance.function();
        appliance.brand();

        System.out.println("-----------");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();
    }
}
