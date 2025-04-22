package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Robot;


public class AITrainer {
    private Robot ref;

    public AITrainer(Robot ref) {
        this.ref = ref;
        System.out.println("💡 AITrainer created with Robot dependency");
    }

    public void use() {
        ref.action();
    }
}
