package com.xworkz.extend.fiftyfold.bank;

public class HDFCBank extends Bank {
    public HDFCBank() {
        super();
        System.out.println("Running non-arg constructor HDFC Bank");
    }
    @Override
    public void deposit() {
        System.out.println("Deposit money in HDFCbank");
    }
    public void withdraw() {
        System.out.println("Withdraw money from HDFC bank");
    }
    public void loan() {
        System.out.println("HDFC Bank provides loans");
    }
    public void interest() {
        System.out.println("HDFC Bank gives interest on savings");
    }
    public void atm() {
        System.out.println("HDFC Bank provides ATM service");
    }
}
