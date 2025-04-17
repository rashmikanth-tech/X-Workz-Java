package com.xworkz.implement.Implements1;

import com.xworkz.implement.Interfaces.
Book;

public class BookImplements1 implements Book {
    @Override
    public void behaviour() {
        System.out.println("running book behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running book identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running book state in implements");
    }
    public void features(){
        System.out.println("feature running in book");

    }
}
