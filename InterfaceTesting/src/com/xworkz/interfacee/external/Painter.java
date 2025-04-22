package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Color;

public class Painter {
    private Color ref;

    public Painter(Color ref) {
        this.ref = ref;
        System.out.println("💡 Painter created with Color dependency");
    }

    public void use() {
        ref.action();
    }
}
