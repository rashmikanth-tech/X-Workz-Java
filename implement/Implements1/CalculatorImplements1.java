package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Calculator;

public class CalculatorImplements1 implements Calculator {
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
    public void features(){
        System.out.println("feature running in calcu");

    }
}
