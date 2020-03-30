package com.touhid;

public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        porsche.setModel("commodore");
//        System.out.println("Model is:  " + porsche.getModel());
//
//        Account bobsAccount = new Account(); //("12345", 0.0, "Bob Brown", "myemailR@bob.com", "(087)123-4567");
//        // Accessing the constructor method
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//        bobsAccount.withdrawal(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(100.0);
//
//        // Another object
//        VipPerson person1 = new VipPerson();
//        System.out.println(person1.getName());
//
//        VipPerson person2 = new VipPerson("Bob", 25000.00);
//        System.out.println(person2.getName());
//
//        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@gmail.com");
//        System.out.println(person3.getName());

        // Object from the Animal and Dog class
//        Animal animal = new Animal("Animal", 1, 1, 5, 5);
//
//        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, "long silky");
//        dog.eat(); // calling the eat function from the Animal class
//        System.out.println();
//        dog.walk();
//        dog.run();

        // inheritance challenge
//        Outlander outlander = new Outlander(36);
//        outlander.steer(45);
        
//        outlander.accelerator(30);
//        outlander.accelerator(20);
//        outlander.accelerator(-42);

        // Composition OOP part
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27Inch Beast", "Acer", 27, new Resolution(2540,1440) );
        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        // Ths process to call the functions and objects form the other class
        PC thePc = new PC(theCase, theMonitor, theMotherboard);
        thePc.powerUp();



    }
}
