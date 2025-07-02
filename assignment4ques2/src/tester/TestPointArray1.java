package tester;

import assignment4ques2.Point2D;
import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Points to Plot : ");
        int n = sc.nextInt();

        Point2D[] points = new Point2D[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the x coordinate for point %d: ", i);
            double x = sc.nextDouble();
            System.out.printf("Enter the y coordinate for point %d: ", i);
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display details of a specific point");
            System.out.println("2. Display all points");
            System.out.println("3. Calculate distance between two points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the index of the point: ");
                    int idx = sc.nextInt();
                    if (idx >= 0 && idx < n) {
                        System.out.printf("Point %d coordinates: %s\n", idx, points[idx].getDetails());
                    } else {
                        System.out.println("Invalid index, please retry!!!!");
                    }
                    break;

                case 2:
                    System.out.println("All points:");
                    for (Point2D p : points) {
                        System.out.println(p);  
                    }
                    break;

                case 3:
                    System.out.print("Enter start point index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end point index: ");
                    int end = sc.nextInt();

                    if (start < 0 || start >= n || end < 0 || end >= n) {
                        System.out.println("Invalid indices, please retry!!!!");
                    } else {
                        Point2D p1 = points[start];
                        Point2D p2 = points[end];
                        if (p1.isEqual(p2)) {
                            System.out.println("Points are at the same position. Distance = 0");
                        } else {
                            double dist = p1.calculateDistance(p2);
                            System.out.printf("Distance between point %d and point %d is: %.4f\n", start, end, dist);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}