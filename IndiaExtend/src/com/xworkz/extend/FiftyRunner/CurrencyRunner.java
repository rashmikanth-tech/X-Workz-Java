package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.cur.Currency;
import com.xworkz.extend.fiftyfold.cur.Dollar;

public class CurrencyRunner {
    public static void main(String[] args) {
        Currency currency = new Dollar();
        currency.value();
        currency.exchangeRate();
        currency.symbol();

        System.out.println("-----------");

        Dollar dollar = new Dollar();
        dollar.value();
        dollar.exchangeRate();
        dollar.symbol();

        Currency currency1 = new Dollar();
        currency1.value();
        currency1.exchangeRate();
        currency1.symbol();
    }
}
