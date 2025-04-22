package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Language;

public class Compiler {
    private Language ref;

    public Compiler(Language ref) {
        this.ref = ref;
        System.out.println("💡 Compiler created with Language dependency");
    }

    public void use() {
        ref.action();
    }
}
