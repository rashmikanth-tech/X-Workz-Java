package com.xworkz.internal;

public class JoystickRunner {
    public static void main(String[] args) {
        Joystick joystick = new Joystick("VersionVal", 81, "HeightVal");
        System.out.println(joystick);

        Joystick joystick1 = new Joystick("VersionVal", 81, "HeightVal");
        int ref = joystick1.hashCode();
        System.out.println("updtaed : " + ref);
    }
}
