package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Consitution;

public class Government {
    public Consitution consitution;

    public Government(Consitution consitution){
        this.consitution=consitution;
        System.out.println("Using CitezenRules In Government");

    }
    public void Display(){
        if(this.consitution != null){
            this.consitution.followLaws();

        }
        else {
            System.err.println("Assign Value for Constitution Laws");
        }
    }
}
