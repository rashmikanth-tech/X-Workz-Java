package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Table;

public class TableImplements1 implements Table {
    @Override
    public void behaviour() {
        System.out.println("running table behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running table identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running table state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in table");

    }
}
