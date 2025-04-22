package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Engine;

public class CarWorkshop {
    private Engine ref;

    public CarWorkshop(Engine ref) {
        this.ref = ref;
        System.out.println("💡 CarWorkshop created with Engine dependency");
    }

    public void use() {
        ref.action();
    }
}
