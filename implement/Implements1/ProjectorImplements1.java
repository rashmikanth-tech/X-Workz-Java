package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Projector;

public class ProjectorImplements1 implements Projector {
    @Override
    public void behaviour() {
        System.out.println("running projector behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running projector identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running projector state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in project");

    }
}
