package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Vehicle;

public class Mechanic {
    private Vehicle ref;

    public Mechanic(Vehicle ref) {
        this.ref = ref;
        System.out.println("💡 Mechanic created with Vehicle dependency");
    }

    public void use() {
        ref.action();
    }
}
