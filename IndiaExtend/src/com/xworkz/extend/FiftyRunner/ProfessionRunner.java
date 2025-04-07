package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.prof.Engineer;
import com.xworkz.extend.fiftyfold.prof.Proffession;

public class ProfessionRunner {
    public static void main(String[] args) {
        Proffession profession=new Engineer();
        profession.work();
        profession.salary();
        profession.skills();
        profession.education();

        System.out.println("-----------");
        Engineer engineer = new Engineer();
        engineer.work();
        engineer.salary();
        engineer.skills();
        engineer.education();
    }
}
