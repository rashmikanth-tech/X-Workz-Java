package com.xworkz.extend.fiftyfold.animal;

public class Cow extends Animal {
    public void givemilk(){
        System.out.println("it give 4 litere milk");
    }
    public void useParent(Animal animal1) {
        animal1.eat();
        animal1.sleep();
        animal1.breathe();
        animal1.sound();
        if (animal1 instanceof Cow){
            Cow cow = (Cow) animal1;
            cow.givemilk();

        }
    }


    }

