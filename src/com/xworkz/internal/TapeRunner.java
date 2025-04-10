package com.xworkz.internal;

public class TapeRunner {
    public static void main(String[] args) {
        Tape tape = new Tape("WidthVal", 49, 26);
        System.out.println(tape);

        Tape tape1 = new Tape("WidthVal", 49, 26);
        int ref = tape1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
