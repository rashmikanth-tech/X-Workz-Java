package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.PaymentGateway;

public class PaymentProcessor {
    private PaymentGateway ref;

    public PaymentProcessor(PaymentGateway ref) {
        this.ref = ref;
        System.out.println("💡 PaymentProcessor created with PaymentGateway dependency");
    }

    public void use() {
        ref.action();
    }
}
