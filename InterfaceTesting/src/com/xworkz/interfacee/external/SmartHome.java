package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.SmartDevice;

public class SmartHome {
    private SmartDevice ref;

    public SmartHome(SmartDevice ref) {
        this.ref = ref;
        System.out.println("💡 SmartHome created with SmartDevice dependency");
    }

    public void use() {
        ref.action();
    }
}
