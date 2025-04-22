package com.xworkz.interfacee.internal;

//.Book;

public class Ramayana implements Book {
    public Ramayana() {
        System.out.println("✅ Ramayana object created");
    }

    @Override
    public void action() {
        System.out.println("Ramayana is performing its Book action.");
    }
}
