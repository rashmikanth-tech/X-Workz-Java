package com.xworkz.internal;

public class PuzzleRunner {
    public static void main(String[] args) {
        Puzzle puzzle = new Puzzle(17, 53, 57);
        System.out.println(puzzle);

        Puzzle puzzle1 = new Puzzle(17, 53, 57);
        int ref = puzzle1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
