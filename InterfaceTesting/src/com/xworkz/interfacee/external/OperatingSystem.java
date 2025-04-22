package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Using Process On Operating System");

    }
    public void Display(){
        if(this.laptop != null){
            this.laptop.action();

        }
        else {
            System.out.println("Check Null Values");
        }
    }
}
