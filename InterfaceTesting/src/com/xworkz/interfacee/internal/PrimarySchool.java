package com.xworkz.interfacee.internal;

//.School;

public class PrimarySchool implements School {
    public PrimarySchool() {
        System.out.println("✅ PrimarySchool object created");
    }

    @Override
    public void action() {
        System.out.println("PrimarySchool is performing its School action.");
    }
}
