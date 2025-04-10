package com.xworkz.internal;

public class CardRunner {
    public static void main(String[] args) {
        Card card = new Card(18, 4, 15);
        System.out.println(card);

        Card card1 = new Card(18, 4, 15);
        int ref = card1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
