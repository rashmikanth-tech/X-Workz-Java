package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.CloudService;

public class DevOps {
    private CloudService ref;

    public DevOps(CloudService ref) {
        this.ref = ref;
        System.out.println("💡 DevOps created with CloudService dependency");
    }

    public void use() {
        ref.action();
    }
}
