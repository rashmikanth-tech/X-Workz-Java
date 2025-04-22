package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Food;

public class Chef {
    private Food ref;

    public Chef(Food ref) {
        this.ref = ref;
        System.out.println("💡 Chef created with Food dependency");
    }

    public void use() {
        ref.action();
    }
}
