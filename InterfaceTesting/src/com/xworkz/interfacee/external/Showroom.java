package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Furniture;

public class Showroom {
    private Furniture ref;

    public Showroom(Furniture ref) {
        this.ref = ref;
        System.out.println("💡 Showroom created with Furniture dependency");
    }

    public void use() {
        ref.action();
    }
}
