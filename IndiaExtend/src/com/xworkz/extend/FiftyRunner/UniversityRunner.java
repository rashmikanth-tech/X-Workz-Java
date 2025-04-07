package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.university.Harvard;
import com.xworkz.extend.fiftyfold.university.University;

public class UniversityRunner {
    public static void main(String[] args) {
        University university = new Harvard();
        university.education();
        university.research();
        university.students();
        university.faculty();
        university.campus();

        System.out.println("-----------");

        Harvard harvard = new Harvard();
        harvard.education();
        harvard.research();
        harvard.students();
        harvard.faculty();
        harvard.campus();
    }
}
