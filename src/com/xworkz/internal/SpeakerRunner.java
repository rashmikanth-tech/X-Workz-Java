package com.xworkz.internal;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(61, 75, 31);
        System.out.println(speaker);

        Speaker speaker1 = new Speaker(61, 75, 31);
        int ref = speaker1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
