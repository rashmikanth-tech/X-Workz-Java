package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Sport;

public class SportsAnalyst {
    private Sport ref;

    public SportsAnalyst(Sport ref) {
        this.ref = ref;
        System.out.println("💡 SportsAnalyst created with Sport dependency");
    }

    public void use() {
        ref.action();
    }
}
