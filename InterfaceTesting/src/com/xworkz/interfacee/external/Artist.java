package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Art;

public class Artist {
    private Art ref;

    public Artist(Art ref) {
        this.ref = ref;
        System.out.println("💡 Artist created with Art dependency");
    }

    public void use() {
        ref.action();
    }
}
