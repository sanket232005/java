package com.samplePaper;


import java.util.Scanner;

public class EmployeeManagementSystem {
    private static final int MAX_EMPLOYEES = 10;
    private static Employee[] employees = new Employee[MAX_EMPLOYEES];
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Management Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Display Employees Joined in Given Year");
            System.out.println("5. Find Employee with Maximum Salary");
            System.out.println("6. Find Employee with Minimum Salary");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (count >= MAX_EMPLOYEES) {
                        System.out.println("Cannot add more employees. Maximum limit reached.");
                    } else {
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Date of Birth (dd mm yyyy): ");
                        int dobDay = sc.nextInt();
                        int dobMonth = sc.nextInt();
                        int dobYear = sc.nextInt();
                        MyDate dob = new MyDate(dobDay, dobMonth, dobYear);
                        sc.nextLine(); // consume newline

                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline

                        System.out.print("Enter Department: ");
                        String department = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        System.out.print("Enter Date of Joining (dd mm yyyy): ");
                        int dojDay = sc.nextInt();
                        int dojMonth = sc.nextInt();
                        int dojYear = sc.nextInt();
                        MyDate doj = new MyDate(dojDay, dojMonth, dojYear);

                        Employee emp = new Employee(name, dob, id, department, salary, doj);
                        employees[count++] = emp;
                        ;
                        System.out.println("Employee added successfully.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employees to display.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println(employees[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].getId() == searchId) {
                            System.out.println("Employee Found:");
                            System.out.println(employees[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee with ID " + searchId + " not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter joining year to filter: ");
                    int searchYear = sc.nextInt();
                    boolean yearFound = false;

                    for (int i = 0; i < count; i++) {
                        if (employees[i].getDateOfJoining().getYear() == searchYear) {
                            System.out.println(employees[i]);
                            yearFound = true;
                        }
                    }

                    if (!yearFound) {
                        System.out.println("No employees joined in year " + searchYear + ".");
                    }
                    break;

                case 5:
                    if (count == 0) {
                        System.out.println("No employees available.");
                    } else {
                        Employee maxEmp = employees[0];
                        for (int i = 1; i < count; i++) {
                            if (employees[i].getSalary() > maxEmp.getSalary()) {
                                maxEmp = employees[i];
                            }
                        }
                        System.out.println("Employee with maximum salary:");
                        System.out.println(maxEmp);
                    }
                    break;

                case 6:
                    if (count == 0) {
                        System.out.println("No employees available.");
                    } else {
                        Employee minEmp = employees[0];
                        for (int i = 1; i < count; i++) {
                            if (employees[i].getSalary() < minEmp.getSalary()) {
                                minEmp = employees[i];
                            }
                        }
                        System.out.println("Employee with minimum salary:");
                        System.out.println(minEmp);
                    }
                    break;

                case 7:
                    System.out.println("Exiting the application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
                    break;
            }
        } while (choice != 7);

        sc.close();
    }
}
