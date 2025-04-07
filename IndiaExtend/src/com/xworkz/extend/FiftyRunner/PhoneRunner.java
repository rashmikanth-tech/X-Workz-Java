package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.phone.Phone;
import com.xworkz.extend.fiftyfold.phone.Smartphone;

public class PhoneRunner {
    public static void main(String[] args) {
        Phone phone = new Smartphone();
        phone.call();
        phone.message();
        phone.camera();
        phone.battery();
        phone.internet();

        Phone phone1 = new Phone();
        phone1.call();
        phone1.message();
        phone1.camera();
        phone1.battery();
        phone1.internet();

        System.out.println("----------");
        Smartphone smartphone=new Smartphone();
        smartphone.call();
        smartphone.message();
        smartphone.camera();
        smartphone.battery();
        smartphone.internet();

    }
}
