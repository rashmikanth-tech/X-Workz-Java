package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Animal;

public class ZooKeeper {
    private Animal ref;

    public ZooKeeper(Animal ref) {
        this.ref = ref;
        System.out.println("💡 ZooKeeper created with Animal dependency");
    }

    public void use() {
        ref.action();
    }
}
