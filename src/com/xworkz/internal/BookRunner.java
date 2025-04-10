package com.xworkz.internal;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book("HeightVal", 90, "BrandVal");
        System.out.println(book);

        Book book1 = new Book("HeightVal", 90, "BrandVal");
        int ref = book1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
