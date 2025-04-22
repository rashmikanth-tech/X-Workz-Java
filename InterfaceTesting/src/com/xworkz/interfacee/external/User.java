package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.TV;

public class User {
    public TV tv;

    public User(TV tv) {
        this.tv = tv;
        System.out.println("User Using TV ");

    }

    public void Display() {
        if (this.tv != null) {
            this.tv.Reciver();
        } else {
            System.out.println("Assign Value For Reciver");
        }


    }
}
