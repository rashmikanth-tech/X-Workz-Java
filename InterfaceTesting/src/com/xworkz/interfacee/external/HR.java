package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Job;

public class HR {
    private Job ref;

    public HR(Job ref) {
        this.ref = ref;
        System.out.println("💡 HR created with Job dependency");
    }

    public void use() {
        ref.action();
    }
}
