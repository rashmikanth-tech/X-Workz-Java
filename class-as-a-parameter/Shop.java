package com.cls.asParameter;

public class Shop {
   public void ads(Display display){
        if ( display != null) {
            display.runner();
        }
        else {
            System.out.println("eror may happens");
        }
    }
}
