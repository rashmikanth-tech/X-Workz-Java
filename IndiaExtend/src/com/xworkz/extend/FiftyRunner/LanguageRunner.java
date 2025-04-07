package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.language.Java;
import com.xworkz.extend.fiftyfold.language.Language;

public class LanguageRunner {
    public static void main(String[] args) {
        Language lang = new Java();
        lang.speak();
        lang.write();
        lang.communicate();
        lang.grammar();
        lang.origin();

        Language lang1= new Language();
        lang1.speak();
        lang1.write();
        lang1.communicate();
        lang1.grammar();
        lang1.origin();

        System.out.println("-----------");
        Java java=new Java();
        java.speak();
        java.write();
        java.communicate();
        java.grammar();
        java.origin();


    }
}
