package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.TransportService;

public class Rider {
    private TransportService ref;

    public Rider(TransportService ref) {
        this.ref = ref;
        System.out.println("💡 Rider created with TransportService dependency");
    }

    public void use() {
        ref.action();
    }
}
