package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.lock.Key;
import com.xworkz.extend.fiftyfold.lock.Lock;

public class KeyRunner {
    public static void main(String[] args) {
        Key key=new Lock();
        key.big();
        key.close();
        key.open();
        key.white();
        key.small();

        System.out.println("-----");
        Lock lock=new Lock();
        lock.big();
        lock.close();
        lock.open();
        lock.white();
        lock.small();

        Key key1 = new Lock();
        key1.big();
        key1.close();
        key1.open();
        key1.white();
        key1.small();

    }
}
