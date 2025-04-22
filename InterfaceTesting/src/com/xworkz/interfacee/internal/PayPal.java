package com.xworkz.interfacee.internal;

//.PaymentGateway;

public class PayPal implements PaymentGateway {
    public PayPal() {
        System.out.println("✅ PayPal object created");
    }

    @Override
    public void action() {
        System.out.println("PayPal is performing its PaymentGateway action.");
    }
}
