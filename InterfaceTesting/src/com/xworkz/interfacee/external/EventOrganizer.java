package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Festival;

public class EventOrganizer {
    private Festival ref;

    public EventOrganizer(Festival ref) {
        this.ref = ref;
        System.out.println("💡 EventOrganizer created with Festival dependency");
    }

    public void use() {
        ref.action();
    }
}
