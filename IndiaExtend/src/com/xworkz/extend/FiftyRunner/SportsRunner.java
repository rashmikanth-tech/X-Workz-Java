package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.sports.Football;
import com.xworkz.extend.fiftyfold.sports.Sports;

public class SportsRunner {
    public static void main(String[] args) {
        Sports sport = new Football();
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        System.out.println("-----------");

        Football football = new Football();
        football.play();
        football.rules();
        football.competition();
        football.team();
        football.training();
    }
}
