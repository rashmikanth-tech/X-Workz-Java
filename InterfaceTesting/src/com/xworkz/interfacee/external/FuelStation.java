package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Fuel;

public class FuelStation {
    private Fuel ref;

    public FuelStation(Fuel ref) {
        this.ref = ref;
        System.out.println("💡 FuelStation created with Fuel dependency");
    }

    public void use() {
        ref.action();
    }
}
