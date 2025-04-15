package com.xworkz.typeofInherit.Hierarchical_Inheritance;

public class Runner {
    public static void main(String[] args) {
        //1.
        Car car = new Car();
        car.startEngine();
        car.drive();
        Bike bike = new Bike();
        bike.startEngine();
        bike.ride();
        //2.
        Manager manager = new Manager();
        manager.work();
        manager.manageTeam();
        Developer developer = new Developer();
        developer.work();
        developer.writeCode();
        //3.
        Circle circle = new Circle();
        circle.display();
        circle.calculateArea();
        Rectangle rectangle = new Rectangle();
        rectangle.display();
        rectangle.calculateArea();
        //4.
        WashingMachine washingMachine= new WashingMachine();
        washingMachine.powerOn();
        washingMachine.washClothes();
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.powerOn();
        refrigerator.coolItems();
        //5.
        SavingsAccount savingsAccount= new SavingsAccount();
        savingsAccount.displayBalance();
        savingsAccount.addInterest();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.displayBalance();
        currentAccount.issueCheque();
        //6.
        Teacher teacher = new Teacher();
        teacher.introduce();
        teacher.teach();
        Doctor doctor = new Doctor();
        doctor.introduce();
        doctor.treatPatients();
        //7.
        Dog dog = new Dog();
        dog.makeSound();
        dog.bark();
        Cat cat = new Cat();
        cat.makeSound();
        cat.meow();
        //8.
        Employee2 employee = new Employee2();
        employee.companyInfo();
        employee.employeeDetails();
        Manager2 manager2= new Manager2();
        manager2.companyInfo();
        manager2.managerInfo();
        //9.
        Smartphone smartphone = new Smartphone();
        smartphone.turnOn();
        smartphone.makeCall();
        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.openApplication();
        //10.
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.checkBalance();
        checkingAccount.withdraw();
        SavingsAccount2 savingsAccount2 = new SavingsAccount2();
        savingsAccount2.checkBalance();
        savingsAccount2.deposit();
        //11.
        ScienceBook scienceBook = new ScienceBook();
        scienceBook.open();
        scienceBook.readChapter();
        HistoryBook historyBook = new HistoryBook();
        historyBook.open();
        historyBook.readPage();
    }
}
