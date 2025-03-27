package com.cls.asParameter;

public class Barber {
    public void  haircut(Price price){
        if (price != null) {
            price.perhead();
        }
        else {
            System.out.println("Error");
        }
    }
}
