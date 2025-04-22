package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.OS;

public class SysAdmin {
    private OS ref;

    public SysAdmin(OS ref) {
        this.ref = ref;
        System.out.println("💡 SysAdmin created with OS dependency");
    }

    public void use() {
        ref.action();
    }
}
