package com.xworkz.extend.FiftyRunner;

import com.xworkz.extend.fiftyfold.tree.Oak;
import com.xworkz.extend.fiftyfold.tree.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Oak();
        tree.roots();
        tree.branches();
        tree.leaves();
        tree.oxygen();
        tree.lifespan();

        System.out.println("-----------");

        Oak oak = new Oak();
        oak.roots();
        oak.branches();
        oak.leaves();
        oak.oxygen();
        oak.lifespan();
    }
}
