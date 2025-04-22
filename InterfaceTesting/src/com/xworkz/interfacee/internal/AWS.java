package com.xworkz.interfacee.internal;

//CloudService;

public class AWS implements CloudService {
    public AWS() {
        System.out.println("✅ AWS object created");
    }

    @Override
    public void action() {
        System.out.println("AWS is performing its CloudService action.");
    }
}
