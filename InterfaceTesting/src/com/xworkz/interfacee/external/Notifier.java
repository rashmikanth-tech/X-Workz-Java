package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Notification;

public class Notifier {
    private Notification ref;

    public Notifier(Notification ref) {
        this.ref = ref;
        System.out.println("💡 Notifier created with Notification dependency");
    }

    public void use() {
        ref.action();
    }
}
