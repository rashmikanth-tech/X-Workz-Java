package com.xworkz.interfacee.internal;


public class AndroidBot implements Robot {
    public AndroidBot() {
        System.out.println("✅ AndroidBot object created");
    }

    @Override
    public void action() {
        System.out.println("AndroidBot is performing its Robot action.");
    }
}
