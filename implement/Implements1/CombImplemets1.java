package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Comb;

public class CombImplemets1 implements Comb {
    @Override
    public void behaviour() {
        System.out.println("running comb behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running comb identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running comb state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in comb");

    }
}
