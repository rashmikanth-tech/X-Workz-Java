package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.ICC;

public class BCCI {

    public ICC icc;

    public BCCI(ICC icc){
        System.out.println("Printing Statement In BCCI");
        this.icc=icc;
    }
    public void Dusplay(){
    if(icc != null){
        this.icc.Fiarplay();

        

    }
    else {
        System.out.println("please assign the value");

    }
    }
}
