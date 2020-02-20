package com.touhid;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("commodore");
        System.out.println("Model is:  " + porsche.getModel());

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

    }
}
