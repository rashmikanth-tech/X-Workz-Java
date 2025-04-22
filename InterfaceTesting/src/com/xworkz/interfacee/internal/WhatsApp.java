package com.xworkz.interfacee.internal;

//.MessageApp;

public class WhatsApp implements MessageApp {
    public WhatsApp() {
        System.out.println("✅ WhatsApp object created");
    }

    @Override
    public void action() {
        System.out.println("WhatsApp is performing its MessageApp action.");
    }
}
