package com.cls.asParameter;

public class Space {
    public void sattelight(Moon moon){
        if(moon != null) {
            moon.earth();
        }
        else{
            System.out.println("Check the value");
        }
    }
}
