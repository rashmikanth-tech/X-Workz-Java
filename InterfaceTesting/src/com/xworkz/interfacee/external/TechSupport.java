package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Device;

public class TechSupport {
    private Device ref;

    public TechSupport(Device ref) {
        this.ref = ref;
        System.out.println("💡 TechSupport created with Device dependency");
    }

    public void use() {
        ref.action();
    }
}
