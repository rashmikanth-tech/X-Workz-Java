package com.xworkz.implement.Interfaces;

public interface WasshingMachine {
    void identity();
    void state();
    void behaviour();
    default void features(){
        System.out.println("feature running");

    }
}
