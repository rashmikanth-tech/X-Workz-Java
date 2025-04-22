package com.xworkz.interfacee.internal;

//.AIModel;

public class ChatGPT implements AIModel {
    public ChatGPT() {
        System.out.println("✅ ChatGPT object created");
    }

    @Override
    public void action() {
        System.out.println("ChatGPT is performing its AIModel action.");
    }
}
