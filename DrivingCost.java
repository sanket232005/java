package com.driving;
import java.util.Scanner;

public class DrivingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("enter total miles drived : ");
        double miles = input.nextDouble();

        System.out.print("enter cost of gasoline: ");
        double cost = input.nextDouble();

        System.out.print("enter average: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("enter parking fees: ");
        double parkingFees = input.nextDouble();

        System.out.print("enter toll: ");
        double tolls = input.nextDouble();

        // Calculate daily driving cost
        double fuelCost = (miles / milesPerGallon) * cost;
        double dailyCost = fuelCost + parkingFees + tolls;

        // Display result
        System.out.printf("Your daily driving cost is: %.2f\n", dailyCost);

        input.close();
    }
}