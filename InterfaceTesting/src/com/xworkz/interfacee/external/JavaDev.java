package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Framework;

public class JavaDev {
    private Framework ref;

    public JavaDev(Framework ref) {
        this.ref = ref;
        System.out.println("💡 JavaDev created with Framework dependency");
    }

    public void use() {
        ref.action();
    }
}
