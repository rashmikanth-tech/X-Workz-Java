package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.TV;

public class Airtel implements TV {

    public  Airtel(){
        System.out.println("Emty Constructor in Airtle");

    }
    @Override
    public void Reciver(){
        System.out.println("Reciver Support Hd Channels");
    }
}
