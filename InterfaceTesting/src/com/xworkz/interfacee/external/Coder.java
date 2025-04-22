package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.AIModel;

public class Coder {
    private AIModel ref;

    public Coder(AIModel ref) {
        this.ref = ref;
        System.out.println("💡 Coder created with AIModel dependency");
    }

    public void use() {
        ref.action();
    }
}
