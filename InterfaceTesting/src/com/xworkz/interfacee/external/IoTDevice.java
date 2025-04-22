package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Sensor;

public class IoTDevice {
    private Sensor ref;

    public IoTDevice(Sensor ref) {
        this.ref = ref;
        System.out.println("💡 IoTDevice created with Sensor dependency");
    }

    public void use() {
        ref.action();
    }
}
