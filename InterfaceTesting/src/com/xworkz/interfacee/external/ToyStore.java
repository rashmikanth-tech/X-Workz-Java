package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Toy;

public class ToyStore {
    private Toy ref;

    public ToyStore(Toy ref) {
        this.ref = ref;
        System.out.println("💡 ToyStore created with Toy dependency");
    }

    public void use() {
        ref.action();
    }
}
