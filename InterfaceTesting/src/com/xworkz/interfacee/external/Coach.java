package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Game;

public class Coach {
    private Game ref;

    public Coach(Game ref) {
        this.ref = ref;
        System.out.println("💡 Coach created with Game dependency");
    }

    public void use() {
        ref.action();
    }
}
