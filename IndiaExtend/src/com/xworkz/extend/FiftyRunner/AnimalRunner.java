package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.animal.Animal;
import com.xworkz.extend.fiftyfold.animal.Cow;
import com.xworkz.extend.fiftyfold.animal.Dog;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal.run();
        animal.eat();
        animal.breathe();
        animal.sleep();

        System.out.println("-----------------");

        Dog dog = new Dog();
        dog.sound();
        dog.run();
        dog.eat();
        dog.breathe();
        dog.sleep();


        System.out.println("-----------------");

        Animal animal1 = new Dog();
        animal1.sound();
        animal1.run();
        animal1.eat();
        animal1.breathe();
        animal1.sleep();

    Animal animal2 = new Cow();
    animal2.sound();
    Cow cow = new Cow();
    cow.useParent(animal2);
    cow.givemilk();



    }
}
