package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.shape.Circle;
import com.xworkz.extend.fiftyfold.shape.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
        shape.area();
        shape.perimeter();
        shape.color();
        shape.dimension();

        System.out.println("------------------");
        Circle circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.dimension();
    }
}
