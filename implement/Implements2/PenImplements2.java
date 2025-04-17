package com.xworkz.implement.Implements2;

import com.xworkz.implement.Interfaces.
Book;
import com.xworkz.implement.Interfaces.
Pen;

public class PenImplements2 implements Pen, Book {
    @Override
    public void behaviour() {
        System.out.println("running pen behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pen identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pen state in implements");
    }
    @Override
    public void features(){
        System.out.println("feature running in pen book");

    }
}
