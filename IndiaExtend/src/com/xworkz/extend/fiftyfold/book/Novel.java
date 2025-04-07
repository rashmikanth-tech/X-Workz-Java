package com.xworkz.extend.fiftyfold.book;

public class Novel extends Book {
    public Novel() {
        super();
        System.out.println("Running non-arg constructor Novel");
    }
    @Override
    public void read() {
        System.out.println("Novel is read");
    }
    public void write() {
        System.out.println("Novel  is written by an author");
    }
    public void publish() {
        System.out.println("Novel  is published");
    }
    public void genre() {
        System.out.println("Novel  has a genre");
    }
    public void pages() {
        System.out.println("Novel  has pages");
    }
}
