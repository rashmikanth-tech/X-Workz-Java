package com.cls.asParameter;
public class Theater {
    public void showInfo(Poster poster){
        if (poster != null) {
            poster.movie();
        }
        else{
            System.out.println("Something wrong");
        }
    }

}
