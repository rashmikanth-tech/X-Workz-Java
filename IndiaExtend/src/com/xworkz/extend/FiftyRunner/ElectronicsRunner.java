package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.electronicDevice.ElectronicDevice;
import com.xworkz.extend.fiftyfold.electronicDevice.Mobile;

public class ElectronicsRunner {

        public static void main(String[] args) {
            ElectronicDevice device=new Mobile();
            device.powerOn();
            device.powerOff();
            device.battery();
            device.charge();

            System.out.println("-----------");
            Mobile mobile = new Mobile();
            mobile.powerOn();
            mobile.powerOff();
            mobile.battery();
            mobile.charge();

            ElectronicDevice electronicDevice = new Mobile();
            electronicDevice.powerOn();
            electronicDevice.powerOff();
            electronicDevice.battery();
            electronicDevice.charge();
        }
    }



