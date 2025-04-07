package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.bank.Bank;
import com.xworkz.extend.fiftyfold.bank.HDFCBank;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank = new HDFCBank();
        bank.deposit();
        bank.withdraw();
        bank.loan();
        bank.interest();
        bank.atm();

        System.out.println("---------------");
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.deposit();
        hdfcBank.withdraw();
        hdfcBank.loan();
        hdfcBank.interest();
        hdfcBank.atm();

        System.out.println("---------------");
        Bank bank1 = new Bank();
        bank1.deposit();
        bank1.withdraw();
        bank1.loan();
        bank1.interest();
        bank1.atm();


    }
}
