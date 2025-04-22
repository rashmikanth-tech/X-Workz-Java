package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.SocialMedia;

public class SocialManager {
    private SocialMedia ref;

    public SocialManager(SocialMedia ref) {
        this.ref = ref;
        System.out.println("💡 SocialManager created with SocialMedia dependency");
    }

    public void use() {
        ref.action();
    }
}
