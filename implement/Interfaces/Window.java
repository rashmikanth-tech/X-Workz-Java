package com.xworkz.implement.Interfaces;

public interface Window {
    void identity();
    void state();
    void behaviour();
    default void features(){
        System.out.println("feature running");

    }
}
