package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.*;

public class CinemaFan {
    private Movie ref;

    public CinemaFan(Movie ref) {
        this.ref = ref;
        System.out.println("💡 CinemaFan created with Movie dependency");
    }

    public void use() {
        ref.action();
    }
}

