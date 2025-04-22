package com.xworkz.interfacee.internal;

//.SocialMedia;

public class Instagram implements SocialMedia {
    public Instagram() {
        System.out.println("✅ Instagram object created");
    }

    @Override
    public void action() {
        System.out.println("Instagram is performing its SocialMedia action.");
    }
}
