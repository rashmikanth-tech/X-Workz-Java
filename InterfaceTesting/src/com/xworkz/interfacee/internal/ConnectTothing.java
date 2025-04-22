package com.xworkz.interfacee.internal;

public class ConnectTothing implements  Connector{
    
    public ConnectTothing(){
        super();
        System.out.println("emty constructor in ConnectTothing");
        
    }
    @Override
    public void  Display(){
        System.out.println("Overide method in ConnectTostring");
        
    }
}
