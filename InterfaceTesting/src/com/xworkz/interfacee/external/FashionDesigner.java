package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Clothing;

public class FashionDesigner {
    private Clothing ref;

    public FashionDesigner(Clothing ref) {
        this.ref = ref;
        System.out.println("💡 FashionDesigner created with Clothing dependency");
    }

    public void use() {
        ref.action();
    }
}
