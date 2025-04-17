package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Socks;

public class SocksImplements1 implements Socks {
    @Override
    public void behaviour() {
        System.out.println("running socks behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running socks identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running socks state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in socks");

    }
}
