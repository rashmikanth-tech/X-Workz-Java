package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Appliance;

public class HomeService {
    private Appliance ref;

    public HomeService(Appliance ref) {
        this.ref = ref;
        System.out.println("💡 HomeService created with Appliance dependency");
    }

    public void use() {
        ref.action();
    }
}
