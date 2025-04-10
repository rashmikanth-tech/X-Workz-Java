package com.xworkz.internal;

public class NotebookRunner {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("MaterialVal", 69, "VersionVal");
        System.out.println(notebook);

        Notebook notebook1 = new Notebook("MaterialVal", 69, "VersionVal");
        int ref = notebook1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
