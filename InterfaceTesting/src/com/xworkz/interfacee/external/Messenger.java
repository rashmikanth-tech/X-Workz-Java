package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.MessageApp;

public class Messenger {
    private MessageApp ref;

    public Messenger(MessageApp ref) {
        this.ref = ref;
        System.out.println("💡 Messenger created with MessageApp dependency");
    }

    public void use() {
        ref.action();
    }
}
