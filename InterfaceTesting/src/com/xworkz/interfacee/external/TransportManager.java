package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Transport;

public class TransportManager {
    private Transport ref;

    public TransportManager(Transport ref) {
        this.ref = ref;
        System.out.println("💡 TransportManager created with Transport dependency");
    }

    public void use() {
        ref.action();
    }
}
