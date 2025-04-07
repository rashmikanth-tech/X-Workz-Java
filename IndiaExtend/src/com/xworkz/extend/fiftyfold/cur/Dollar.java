package com.xworkz.extend.fiftyfold.cur;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("Running non-arg constructor of Dollar");
    }

    @Override
    public void value() {
        System.out.println("Dollar has monetary value");
    }

    public void exchangeRate() {
        System.out.println("Dollar has an exchange rate");
    }

    public void symbol() {
        System.out.println("Dollar has a unique symbol");
    }

    public void usage() {
        System.out.println("Dollar is used for trade and transactions");
    }
}
