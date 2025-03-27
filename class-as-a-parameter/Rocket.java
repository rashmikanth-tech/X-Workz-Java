package com.cls.asParameter;

public class Rocket {
    public void brand(Company company) {
        if (company != null) {
            company.name();
        }
        else {
            System.out.println("wrong data");

        }
    }
}
