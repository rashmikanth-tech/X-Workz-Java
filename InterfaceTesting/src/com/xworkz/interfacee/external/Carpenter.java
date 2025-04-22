package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Tool;

public class Carpenter {
    private Tool ref;

    public Carpenter(Tool ref) {
        this.ref = ref;
        System.out.println("💡 Carpenter created with Tool dependency");
    }

    public void use() {
        ref.action();
    }
}
