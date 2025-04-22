package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Battery;

public class Electrician {
    private Battery ref;

    public Electrician(Battery ref) {
        this.ref = ref;
        System.out.println("💡 Electrician created with Battery dependency");
    }

    public void use() {
        ref.action();
    }
}
