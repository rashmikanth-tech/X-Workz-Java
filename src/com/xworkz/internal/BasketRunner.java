package com.xworkz.internal;

public class BasketRunner {
    public static void main(String[] args) {
        Basket basket = new Basket("YearVal", 31, "CapacityVal");
        System.out.println(basket);

        Basket basket1 = new Basket("YearVal", 31, "CapacityVal");
        int ref = basket1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
