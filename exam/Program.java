package com.exam;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Staff[] staffList = new Staff[10];
        int count = 0;
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n---  Staff Management ---");
            System.out.println("1. Add Teaching staff");
            System.out.println("2. Add Lab staff");
            System.out.println("3. Display all Teaching staff");
            System.out.println("4. Display all Lab staff");
            System.out.println("5. Find specific Teaching staff by ID");
            System.out.println("6. Find specific Lab staff by ID");
            System.out.println("7. Display Teaching staff with highest hours");
            System.out.println("8. Display Lab staff with lowest salary");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Staff limit reached.");
                        break;
                    }
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter No of Hours: ");
                        double hours = sc.nextDouble();
                        System.out.print("Enter Charges per Hour: ");
                        double charges = sc.nextDouble();

                        staffList[count++] = new TeachingStaff(id, name, hours, charges);
                        System.out.println("Teaching staff added.");
                    } catch (StaffException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    if (count >= 10) {
                        System.out.println("Staff limit reached.");
                        break;
                    }
                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        staffList[count++] = new LabStaff(id, name, salary);
                        System.out.println("Lab staff added.");
                    } catch (StaffException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    for (int i = 0; i < count; i++)
                        if (staffList[i] instanceof TeachingStaff)
                            System.out.println(staffList[i]);
                    break;

                case 4:
                    for (int i = 0; i < count; i++)
                        if (staffList[i] instanceof LabStaff)
                            System.out.println(staffList[i]);
                    break;

                case 5:
                    System.out.print("Enter Teaching Staff ID: ");
                    int tid = sc.nextInt();
                    boolean foundTeach = false;
                    for (int i = 0; i < count; i++) {
                        if (staffList[i] instanceof TeachingStaff && staffList[i].getId() == tid) {
                            System.out.println(staffList[i]);
                            foundTeach = true;
                        }
                    }
                    if (!foundTeach) System.out.println("Teaching staff not found.");
                    break;

                case 6:
                    System.out.print("Enter Lab Staff ID: ");
                    int lid = sc.nextInt();
                    boolean foundLab = false;
                    for (int i = 0; i < count; i++) {
                        if (staffList[i] instanceof LabStaff && staffList[i].getId() == lid) {
                            System.out.println(staffList[i]);
                            foundLab = true;
                        }
                    }
                    if (!foundLab) System.out.println("Lab staff not found.");
                    break;

                case 7:
                    double maxHours = -1;
                    TeachingStaff topStaff = null;
                    for (int i = 0; i < count; i++) {
                        if (staffList[i] instanceof TeachingStaff ts) {
                            if (ts.getNoOfHours() > maxHours) {
                                maxHours = ts.getNoOfHours();
                                topStaff = ts;
                            }
                        }
                    }
                    if (topStaff != null)
                        System.out.println("Highest Hours Teaching Staff:\n" + topStaff);
                    else
                        System.out.println("No teaching staff found.");
                    break;

                case 8:
                    double minSalary = Double.MAX_VALUE;
                    LabStaff lowSalaryStaff = null;
                    for (int i = 0; i < count; i++) {
                        if (staffList[i] instanceof LabStaff ls) {
                            if (ls.getSalary() < minSalary) {
                                minSalary = ls.getSalary();
                                lowSalaryStaff = ls;
                            }
                        }
                    }
                    if (lowSalaryStaff != null)
                        System.out.println("Lowest Salary Lab Staff:\n" + lowSalaryStaff);
                    else
                        System.out.println("No lab staff found.");
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 9);
    }
}
