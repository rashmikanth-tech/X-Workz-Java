package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.subject.Mathematics;
import com.xworkz.extend.fiftyfold.subject.Subject;

public class SubjectRunner {
    public static void main(String[] args) {
        Subject subject=new Mathematics();
        subject.study();
        subject.exam();
        subject.difficulty();
        subject.syllabus();

        System.out.println("-----------");
        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();
    }
}
