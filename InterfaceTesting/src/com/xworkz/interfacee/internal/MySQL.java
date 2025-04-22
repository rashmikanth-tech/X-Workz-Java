package com.xworkz.interfacee.internal;

//.Database;

public class MySQL implements Database {
    public MySQL() {
        System.out.println("✅ MySQL object created");
    }

    @Override
    public void action() {
        System.out.println("MySQL is performing its Database action.");
    }
}
