package com.xworkz.extend.fiftyfold.employee;

public class Manager extends Employee {
    public Manager() {
        super();
        System.out.println("Running non-arg constructor Manager");
    }
    @Override
    public void work() {
        System.out.println("Manager is working");
    }
    public void salary() {
        System.out.println("Manager  gets salary");
    }
    public void benefits() {
        System.out.println("Manager  gets benefits");
    }
    public void experience() {
        System.out.println("Manager  gains experience");
    }
    public void department() {
        System.out.println("Manager  belongs to a department");
    }
}
