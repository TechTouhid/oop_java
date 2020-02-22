package com.touhid;

public class Account {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmainAddress;
    private String customerPhoneNumber;

    // Created constructor method
    public Account() {
        // call a constructor form another constructor
        this("456", 10.3, "Default Name", "Default Email", "Default Phone");
        System.out.println("Constructor has been created!!");
    }

    // Overloading constructor method
    public Account(String number, double balance, String customerName, String customerEmainAddress, String customerPhoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmainAddress = customerEmainAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining this.balance is " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmainAddress() {
        return customerEmainAddress;
    }

    public void setCustomerEmainAddress(String customerEmainAddress) {
        this.customerEmainAddress = customerEmainAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
