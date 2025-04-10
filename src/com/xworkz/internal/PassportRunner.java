package com.xworkz.internal;

public class PassportRunner {
    public static void main(String[] args) {
        Passport passport = new Passport(58, 30, "PowerVal");
        System.out.println(passport);

        Passport passport1 = new Passport(58, 30, "PowerVal");
        int ref = passport1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
