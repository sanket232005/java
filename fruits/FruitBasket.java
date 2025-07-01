package com.app.fruits;

import java.util.Scanner;
import com.app.fruits.*;

public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basket size: ");
        int size = sc.nextInt();
        Fruit[] basket = new Fruit[size];
        int counter = 0;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n0. Exit\n1. Add Mango\n2. Add Orange\n3. Add Apple");
            System.out.println("4. Display names of all fruits");
            System.out.println("5. Display details of fresh fruits");
            System.out.println("6. Mark a fruit as stale");
            System.out.println("7. Display taste of stale fruits");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 0:
                    exit = true;
                    break;

                case 1: 
                    if (counter < size) {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        sc.nextLine(); 
                        String color = sc.nextLine();
                        basket[counter++] = new Mango(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 2: 
                    if (counter < size) {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        sc.nextLine();
                        String color = sc.nextLine();
                        basket[counter++] = new Orange(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 3: 
                    if (counter < size) {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        System.out.print("Enter color: ");
                        sc.nextLine();
                        String color = sc.nextLine();
                        basket[counter++] = new Apple(name, weight, color);
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;

                case 4: 
                    System.out.println("Fruit names in basket:");
                    for (Fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;

                case 5: 
                    System.out.println("Details of fresh fruits:");
                    for (Fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f.toString() + ", Taste: " + f.taste());
                        }
                    }
                    break;

                case 6: 
                    System.out.print("Enter index to mark stale: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < counter && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println("Marked fruit as stale.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 7: 
                    System.out.println("Tastes of stale fruits:");
                    for (Fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println(f.getName() + " : " + f.taste());
                        }
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
