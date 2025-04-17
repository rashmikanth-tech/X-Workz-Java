package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Train;

public class TrainImplements1 implements Train {
    @Override
    public void behaviour() {
        System.out.println("running train behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running train identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running train state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in train");

    }
}
