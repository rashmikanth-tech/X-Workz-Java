package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Plant;

public class Gardener {
    private Plant ref;

    public Gardener(Plant ref) {
        this.ref = ref;
        System.out.println("💡 Gardener created with Plant dependency");
    }

    public void use() {
        ref.action();
    }
}
