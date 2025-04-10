package com.xworkz.internal;

public class BoardRunner {
    public static void main(String[] args) {
        Board board = new Board(88, 66, 53);
        System.out.println(board);

        Board board1 = new Board(88, 66, 53);
        int ref = board1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
