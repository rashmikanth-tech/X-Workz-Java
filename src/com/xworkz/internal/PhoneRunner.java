package com.xworkz.internal;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Phone("PowerVal", 64, 84);
        System.out.println(phone);

        Phone phone1 = new Phone("PowerVal", 64, 84);
        int ref = phone1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
