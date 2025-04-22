package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.School;

public class EducationBoard {
    private School ref;

    public EducationBoard(School ref) {
        this.ref = ref;
        System.out.println("💡 EducationBoard created with School dependency");
    }

    public void use() {
        ref.action();
    }
}
