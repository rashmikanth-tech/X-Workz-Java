package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Laptop;

public class ITGuy {
    private Laptop ref;

    public ITGuy(Laptop ref) {
        this.ref = ref;
        System.out.println("💡 ITGuy created with Laptop dependency");
    }

    public void use() {
        ref.action();
    }
}
