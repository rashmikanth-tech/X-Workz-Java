package com.xworkz.internal;

public class WalletChainRunner {
    public static void main(String[] args) {
        WalletChain walletChain = new WalletChain(35, 52, "SpeedVal");
        System.out.println(walletChain);

        WalletChain walletChain1 = new WalletChain(35, 52, "SpeedVal");
        int ref = walletChain1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
