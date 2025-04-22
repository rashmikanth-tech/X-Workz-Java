package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Camera;

public class Photographer {
    private Camera ref;

    public Photographer(Camera ref) {
        this.ref = ref;
        System.out.println("💡 Photographer created with Camera dependency");
    }

    public void use() {
        ref.action();
    }
}
