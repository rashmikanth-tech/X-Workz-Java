package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Security;

public class NetworkAdmin {
    private Security ref;

    public NetworkAdmin(Security ref) {
        this.ref = ref;
        System.out.println("💡 NetworkAdmin created with Security dependency");
    }

    public void use() {
        ref.action();
    }
}
