package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Service;

public class HomeOwner {
    private Service ref;

    public HomeOwner(Service ref) {
        this.ref = ref;
        System.out.println("💡 HomeOwner created with Service dependency");
    }

    public void use() {
        ref.action();
    }
}
