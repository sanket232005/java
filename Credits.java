package com.creditcalculator;

import java.util.Scanner;

class Customer {
    private int accountNumber;
    private int beginningBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    public Customer(int accountNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }

    public int calculateNewBalance() {
        return beginningBalance + totalCharges - totalCredits;
    }

    public void displayStatus() {
        int newBalance = calculateNewBalance();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded\n");
        } else {
            System.out.println("Within credit limit\n");
        }
    }
}

public class Credits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numberOfCustomers = scanner.nextInt();

        for (int i = 1; i <= numberOfCustomers; i++) {
            System.out.println("\nEnter details for Customer " + i);

            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();

            System.out.print("Beginning Balance: ");
            int beginningBalance = scanner.nextInt();

            System.out.print("Total Charges: ");
            int totalCharges = scanner.nextInt();

            System.out.print("Total Credits: ");
            int totalCredits = scanner.nextInt();

            System.out.print("Credit Limit: ");
            int creditLimit = scanner.nextInt();

            Customer customer = new Customer(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);
            customer.displayStatus();
        }

       
    }
}
