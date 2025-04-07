package com.xworkz.extend.FiftyRunner;


import com.xworkz.extend.fiftyfold.employee.Employee;
import com.xworkz.extend.fiftyfold.employee.Manager;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee emp = new Manager();
        emp.work();
        emp.salary();
        emp.benefits();
        emp.experience();
        emp.department();

        Employee emp1 = new Employee();
        emp1.work();
        emp1.salary();
        emp1.benefits();
        emp1.experience();
        emp1.department();

        System.out.println("-------------------");
        Manager manager=new Manager();
        manager.work();
        manager.salary();
        manager.benefits();
        manager.experience();
        manager.department();

    }
}
