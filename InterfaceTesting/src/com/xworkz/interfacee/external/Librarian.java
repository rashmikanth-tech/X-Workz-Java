package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Book;

public class Librarian {
    private Book ref;

    public Librarian(Book ref) {
        this.ref = ref;
        System.out.println("💡 Librarian created with Book dependency");
    }

    public void use() {
        ref.action();
    }
}
