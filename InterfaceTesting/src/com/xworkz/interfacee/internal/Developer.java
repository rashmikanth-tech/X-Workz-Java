package com.xworkz.interfacee.internal;

//.Job;

public class Developer implements Job {
    public Developer() {
        System.out.println("✅ Developer object created");
    }

    @Override
    public void action() {
        System.out.println("Developer is performing its Job action.");
    }
}
