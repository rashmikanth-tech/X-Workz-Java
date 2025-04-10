package com.xworkz.internal;

public class WalletRunner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet("PriceVal", "TypeVal", 7);
        System.out.println(wallet);

        Wallet wallet1 = new Wallet("PriceVal", "TypeVal", 7);
        int ref = wallet1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
