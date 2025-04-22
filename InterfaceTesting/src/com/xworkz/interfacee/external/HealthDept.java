package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Hospital;

public class HealthDept {
    private Hospital ref;

    public HealthDept(Hospital ref) {
        this.ref = ref;
        System.out.println("💡 HealthDept created with Hospital dependency");
    }

    public void use() {
        ref.action();
    }
}
