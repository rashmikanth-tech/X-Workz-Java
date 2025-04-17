package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Calculator;
import com.xworkz.implement.Interfaces.
Microwave;

public class CalculatorImplements2 implements Calculator, Microwave {
    @Override
    public void behaviour() {
        System.out.println("running calculator behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running calculator identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running calculator state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in calc micro");

    }
}
