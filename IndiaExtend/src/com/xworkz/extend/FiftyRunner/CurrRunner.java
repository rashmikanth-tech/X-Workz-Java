package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.cur.Currency;
import com.xworkz.extend.fiftyfold.cur.Dollar;

public class CurrRunner {
    public static void main(String[] args) {
        Currency currency=new Dollar();
        currency.value();
        currency.exchangeRate();
        currency.symbol();
        currency.usage();

        System.out.println("-----------");
        Dollar dollar = new Dollar();
        dollar.value();
        dollar.exchangeRate();
        dollar.symbol();
        dollar.usage();
    }
}
