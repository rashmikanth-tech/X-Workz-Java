package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.book.Book;
import com.xworkz.extend.fiftyfold.book.Novel;

public class BookRunner {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.read();
        book1.write();
        book1.publish();
        book1.genre();
        book1.pages();

        Book book = new Novel();
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        System.out.println("-----------");

        Novel novel = new Novel();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();
    }
}
