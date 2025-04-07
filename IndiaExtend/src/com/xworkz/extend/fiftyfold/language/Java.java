package com.xworkz.extend.fiftyfold.language;

public class Java extends Language {
    public Java() {
        super();
        System.out.println("Running non-arg constructor Java");
    }
    @Override
    public void speak() {
        System.out.println("Java is spoken");
    }
    public void write() {
        System.out.println("Java is written");
    }
    public void communicate() {
        System.out.println("Java is not used for communication");
    }
    public void grammar() {
        System.out.println("Java has no grammar rules");
    }
    public void origin() {
        System.out.println("Java has no origin");
    }
}
