package com.xworkz.interfacee.internal;

//.Notification;

public class Email implements Notification {
    public Email() {
        System.out.println("✅ Email object created");
    }

    @Override
    public void action() {
        System.out.println("Email is performing its Notification action.");
    }
}
